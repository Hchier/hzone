package cc.hchier.mapper;

import cc.hchier.dto.BlogPublishDTO;
import cc.hchier.dto.BlogUpdateDTO;
import cc.hchier.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author hchier
 */
@Mapper
public interface BlogMapper {
    /**
     * 删除博客
     *
     * @param id        id
     * @param publisher 作者
     * @return int
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("publisher") String publisher);

    /**
     * 插入博客
     *
     * @param dto dto
     * @return int
     */
    int insert(BlogPublishDTO dto);

    /**
     * 更新博客
     *
     * @param dto dto
     * @return int
     */
    int updateByPrimaryKey(BlogUpdateDTO dto);

    /**
     * 根据主键查找博客
     *
     * @param id id
     * @return {@link Blog}
     */
    Blog selectByPrimaryKey(Integer id);

}