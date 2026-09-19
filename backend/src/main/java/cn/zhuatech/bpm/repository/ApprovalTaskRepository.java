/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm.repository;
import cn.zhuatech.bpm.model.ApprovalTask;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
public interface ApprovalTaskRepository extends JpaRepository<ApprovalTask,Long>{/**
                                                                                  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                  */
List<ApprovalTask> findAllByOrderByExpenseDateDesc();}
