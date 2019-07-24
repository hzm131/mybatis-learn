package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * 用户持久层操作
 *
 * mybatis的环境搭建：
 *  1.创建maven工程并导入坐标
 *  2.创建实体类和dao的接口
 *  3.创建mybatis的主配置文件：SqlMapConfig.xml
 *  4.创建映射配置文件：IUserDao.xml
 *
 *  注意：
 *  1.创建IUserDao.xml和IUserDao.java时，名称是为了和我们之前的知识保持一致。
 *  在mybatis中它把持久层的操作接口名称和映射文件也叫做:Mapper，
 *  所以:IUserDao和IUserMapper是一样的
 *
 *  2.在idea中创建目录的时候，它和包是不一样的
 *
 *  3.mybatis的映射配置文件位置必须和dao接口的包结构相同
 *
 *  4.映射配置文件的mapper标签的namespace属性的取值必须是dao接口的全限定名称
 *
 *  5.映射配置文件的操作配置（select），id属性的取值必须是dao接口的方法名
 *
 *  当我们遵从了第三，四，五点之后，我们在开发中就无须再写dao的实现类
 */
public interface IUserDao {
    List<User> findAll();
}
