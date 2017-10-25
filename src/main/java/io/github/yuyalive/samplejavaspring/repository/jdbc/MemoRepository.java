package io.github.yuyalive.samplejavaspring.repository.jdbc;

import io.github.yuyalive.samplejavaspring.model.Memo;

import java.util.List;

public interface MemoRepository {
    List<Memo> find();
    List<Memo> findByAuthor(String author);
    void save(Memo item);
}
