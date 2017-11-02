package com.felit.elasticsearch.plugin;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.hunspell.Dictionary;
import org.elasticsearch.index.analysis.AnalyzerProvider;
import org.elasticsearch.index.analysis.CharFilterFactory;
import org.elasticsearch.index.analysis.TokenFilterFactory;
import org.elasticsearch.index.analysis.TokenizerFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.*;

import java.util.Map;

/**
 * 插件种类
 * ActionPlugin
 * AnalysisPlugin
 * ClusterPlugin
 * DiscoveryPlugin
 * IngestPlugin
 * MapperPlugin
 * NetworkPlugin
 * RepositoryPlugin
 * ScriptPlugin
 * SearchPlugin
 */
public class PluginExample extends Plugin implements AnalysisPlugin {
    public Map<String, AnalysisModule.AnalysisProvider<CharFilterFactory>> getCharFilters() {
        return null;
    }

    public Map<String, AnalysisModule.AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
        return null;
    }

    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        return null;
    }

    public Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        return null;
    }

    public Map<String, Dictionary> getHunspellDictionaries() {
        return null;
    }
}
