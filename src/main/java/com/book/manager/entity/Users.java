package com.book.manager.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 用户实体类
 * @Date 2024/12/22 15:39
 * @Author by me
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

//作用是在执行更新（UPDATE）操作时，动态地生成SQL的UPDATE语句，只更新那些发生变化的字段，而不是更新实体类对应的数据库表中的所有字段
@DynamicUpdate

//作用是在执行更新（Insert）操作时，动态地生成SQL的UPDATE语句，只更新那些发生变化的字段，而不是更新实体类对应的数据库表中的所有字段
@DynamicInsert

//标记一个 Java 类为实体类
@Entity
@Table(name = "users")
public class Users {

    @ApiModelProperty("主键ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("生日")
    private Date birthday;

    @ApiModelProperty("是否为管理员")
    private Integer isAdmin;

    @ApiModelProperty("电话")
    private String tel;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("可借数量")
    private Integer size;

    @ApiModelProperty("身份：0 学生,1 教师,2 校外人士,3 管理员")
    private Integer identity;

    // json： {"id":id,"avatar":avatar,"nickname":nickname,"username":username,"password":password,"birthday":birthday,"isAdmin":isAdmin,"tel":tel
    // ,"email":email,"address":address,"size":size,"identity":identity}
}
