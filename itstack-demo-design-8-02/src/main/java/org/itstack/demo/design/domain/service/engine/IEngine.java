package org.itstack.demo.design.domain.service.engine;

import org.itstack.demo.design.domain.model.aggregates.TreeRich;
import org.itstack.demo.design.domain.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {
    /**
     * 处理决策
      * @param treeId 决策树id
     * @param userId 用户id
     * @param treeRich 决策树
     * @param decisionMatter 决策属性
     * @return 决策结果
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
