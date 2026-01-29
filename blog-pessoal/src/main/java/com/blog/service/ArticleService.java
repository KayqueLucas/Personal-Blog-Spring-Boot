package com.blog.service;

import com.blog.model.Article;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class ArticleService {
    private final Path basePath = Paths.get("src/main/resources/articles");
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Article> findAll() throws IOException{
        if(!Files.exists(basePath)){
            Files.createDirectories(basePath);
        }
        return Files.list(basePath)
                .map(path ->{
                    try{
                        return read(path);
                    }catch(IOException e){
                        throw new RuntimeException("Erro ao ler artigo: " + path.getFileName(), e);
                    }
                })
                .sorted(Comparator.comparing(Article::getPublishedAt).reversed())
                .toList();
    }
    public Article findById(long id) throws IOException {
        return read(basePath.resolve(id + ".json"));
    }

    public void save(Article article) throws  IOException{
        Path file = basePath.resolve(article.getId() + ".json");
                mapper.writeValue(file.toFile(), article);
    }

    public void delete(Long id) throws IOException{
        Files.deleteIfExists(basePath.resolve(id + "json"));
    }

    private Article read(Path path) throws IOException {
        return mapper.readValue(path.toFile(), Article.class);
    }

}
