package com.txh.xiaomi2024.work.service.dao.source_build_es_helper.strategy;

import com.txh.xiaomi2024.work.service.dao.source_build_es_helper.SourceBuildContent;
import org.elasticsearch.search.builder.SearchSourceBuilder;


public interface SourceBuildStrategy {
    void apply(SourceBuildContent content, SearchSourceBuilder sourceBuilder);
}
