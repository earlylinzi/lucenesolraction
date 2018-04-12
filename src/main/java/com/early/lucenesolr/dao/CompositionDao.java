package com.early.lucenesolr.dao;

import com.early.lucenesolr.domain.Composition;

import java.util.List;

public interface CompositionDao {
    List<Composition> selectCompositionList();
}
