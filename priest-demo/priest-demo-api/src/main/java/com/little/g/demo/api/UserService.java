package com.little.g.demo.api;

import com.little.g.common.dto.ListResultDTO;
import com.little.g.common.params.TimeQueryParam;
import com.little.g.common.validate.BeanValid;
import com.little.g.demo.dto.UserDTO;

import javax.validation.constraints.NotBlank;

/**
 * Created by lengligang on 2019/3/9.
 */
public interface UserService {
    /**
     * 添加
     * @param entity
     * @return
     */
    boolean add(@BeanValid(type = UserDTO.class) UserDTO entity);

    /**
     * 根据id获取
     * @param id
     * @return
     */
    UserDTO get(@NotBlank Integer id);

    /**
     * 更新
     * @param entity
     * @return
     */
    boolean update(@BeanValid(type = UserDTO.class) UserDTO entity);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(@NotBlank Integer id);

    /**
     * 增量查询
     * @param param
     * @return
     */
    ListResultDTO<UserDTO> list(@NotBlank TimeQueryParam param);

}