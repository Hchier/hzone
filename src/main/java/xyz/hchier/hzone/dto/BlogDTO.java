package xyz.hchier.hzone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author by Hchier
 * @Date 2022/6/23 18:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO implements Serializable {
    private Integer id;

    private String publisher;

    private String title;

    private String content;

    private Boolean selfVisible;

    private Date updateTime;

    private List<String> tagList;

    private static final long serialVersionUID = 1L;
}
