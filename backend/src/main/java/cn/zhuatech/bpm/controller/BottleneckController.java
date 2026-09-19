/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm.controller;

import cn.zhuatech.bpm.common.ApiResponse;
import cn.zhuatech.bpm.service.BottleneckAssessmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/bpm")
public class BottleneckController {
    private final BottleneckAssessmentService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public BottleneckController(BottleneckAssessmentService service) { this.service = service; }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/bottleneck-assessment")
    public ApiResponse<BottleneckAssessmentService.Result> assess(@Valid @RequestBody BottleneckAssessmentService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
