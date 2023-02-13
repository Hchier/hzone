package cc.hchier.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author by Hchier
 * @Date 2023/2/13 15:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPwdUpdateDTO {

    private String username;

    @NotBlank(message = "password不能为blank")
    private String password;

    @Email(message = "邮箱格式错误")
    private String email;

    @NotBlank(message = "验证码不能为blank")
    private String authCode;
}
