package net.cc1000.fangiqlweb.system.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;


//实体类的实现,主要用来完成数据crud,主要用于简单的语句实现,入股要实现较复杂的查询,还是需要配合EnityManger来完成.
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User>, Serializable {
}
