package com.book.manager.util.ro;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 分页对象
 * @Date 2024/12/19 16:51
 * @Author by me
 */
@Data
public class PageIn {

    /** 搜索关键字 */
    @ApiModelProperty("搜索关键字")
    private String keyword;
    
    /** 当前页 */
    @ApiModelProperty("当前页")
    private Integer currPage;

    /** 当前页条数 */
    @ApiModelProperty("每页数量")
    private Integer pageSize;
}
