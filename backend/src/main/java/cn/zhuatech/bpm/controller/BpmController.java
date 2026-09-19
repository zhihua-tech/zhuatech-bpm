/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm.controller;

import cn.zhuatech.bpm.common.ApiResponse;import cn.zhuatech.bpm.dto.BpmDto.*;import cn.zhuatech.bpm.service.BpmService;import jakarta.validation.Valid;import org.springframework.security.access.prepost.PreAuthorize;import org.springframework.web.bind.annotation.*;import java.util.List;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/bpm")
public class BpmController {
    private final BpmService service; /**
                                       * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                       */
public BpmController(BpmService service){this.service=service;}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/dashboard") public ApiResponse<Dashboard> dashboard(){return ApiResponse.ok(service.dashboard());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/process-definitions") public ApiResponse<List<AccountView>> accounts(){return ApiResponse.ok(service.accounts());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/process-instances") public ApiResponse<List<ProcessInstanceView>> processInstances(){return ApiResponse.ok(service.processInstances());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/process-tasks") public ApiResponse<List<ProcessTaskView>> processTasks(){return ApiResponse.ok(service.processTasks());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/approval-tasks") public ApiResponse<List<ExpenseView>> expenses(){return ApiResponse.ok(service.expenses());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/sla-policies") public ApiResponse<List<SlaPolicyView>> slaPolicys(){return ApiResponse.ok(service.slaPolicys());}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/process-instances") @PreAuthorize("hasAnyRole('ADMIN','PROCESS_MANAGER')") public ApiResponse<ProcessInstanceView> createProcessInstance(@Valid @RequestBody CreateProcessInstanceRequest request){return ApiResponse.ok("流程实例创建成功",service.createProcessInstance(request));}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PatchMapping("/process-instances/{id}/progress") @PreAuthorize("hasAnyRole('ADMIN','PROCESS_MANAGER')") public ApiResponse<ProcessInstanceView> recordReceipt(@PathVariable Long id,@Valid @RequestBody RecordReceiptRequest request){return ApiResponse.ok("流程进度更新成功",service.recordReceipt(id,request));}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/approval-tasks") @PreAuthorize("hasAnyRole('ADMIN','PROCESS_MANAGER','EMPLOYEE')") public ApiResponse<ExpenseView> submitExpense(@Valid @RequestBody SubmitExpenseRequest request){return ApiResponse.ok("流程任务已提交",service.submitExpense(request));}
}
