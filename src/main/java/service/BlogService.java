package service;

import model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import respository.BlogRespository;

import java.util.List;

public class BlogService implements IBlogService {
    @Autowired
    private BlogRespository blogRespository;

    @Override
    public List<Blog> findAll() {
        return blogRespository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRespository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRespository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRespository.remove(id);

    }
}
