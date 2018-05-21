package com.springbootstuday.service.database;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by LorenWang on 2018/5/21.
 * 创建时间：2018/5/21 21:32
 * 创建人：王亮（Loren wang）
 * 功能作用：
 * 思路：
 * 方法：
 * 注意：
 * 修改人：
 * 修改时间：
 * 备注：
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
