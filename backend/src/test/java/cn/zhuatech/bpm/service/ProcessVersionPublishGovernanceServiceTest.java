/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm.service;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class ProcessVersionPublishGovernanceServiceTest {
    private final ProcessVersionPublishGovernanceService service = new ProcessVersionPublishGovernanceService();
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void publishesControlledVersion() {
        var result = service.assess(new ProcessVersionPublishGovernanceService.Request("purchase", 4, true, true, true, true, true, 12, true, true, true));
        assertThat(result.decision()).isEqualTo(ProcessVersionPublishGovernanceService.Decision.PUBLISH);
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void holdsUnsafeBreakingChange() {
        var result = service.assess(new ProcessVersionPublishGovernanceService.Request("contract", 7, false, false, false, false, true, 30, false, false, false));
        assertThat(result.decision()).isEqualTo(ProcessVersionPublishGovernanceService.Decision.HOLD);
        assertThat(result.blockers()).hasSize(5);
        assertThat(result.actions()).hasSize(2);
    }
}
