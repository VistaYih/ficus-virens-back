package dev.daqiang.blog.infra.mapper;

import dev.daqiang.blog.domain.entity.ThemeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThemeNodeMapper {

    List<ThemeNode> selectUnderRootNode();

    List<ThemeNode> selectUnderCustomNode(Integer left, Integer right);

    List<ThemeNode> selectNodeAToNodeBPath(Integer leftA, Integer rightA, Integer leftB, Integer rightB);

    Integer insertThemeNode(ThemeNode node);

    Integer updateNode(ThemeNode node);

    Integer updateNodes(List<ThemeNode> nodes);

    Integer deleteLeafNode(Integer left, Integer right);

    Integer deleteAllUnderNode(Integer left, Integer right);
}
