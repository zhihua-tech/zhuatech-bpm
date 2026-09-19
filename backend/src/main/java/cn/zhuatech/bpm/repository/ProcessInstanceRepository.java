/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm.repository;
import cn.zhuatech.bpm.model.ProcessInstance;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;import java.util.Optional;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
public interface ProcessInstanceRepository extends JpaRepository<ProcessInstance,Long>{/**
                                                                                        * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                        */
Optional<ProcessInstance> findByProcessInstanceNo(String no);/**
                                                                                                                                                     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                     */
List<ProcessInstance> findAllByOrderByDueDateAsc();}
