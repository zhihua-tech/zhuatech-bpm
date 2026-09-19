/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.bpm;

import cn.zhuatech.bpm.service.ApprovalDelegationService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class ApprovalDelegationServiceTests {
    private final ApprovalDelegationService service = new ApprovalDelegationService();

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void activatesDelegationForBacklog() {
        var result = service.route(new ApprovalDelegationService.Request(30, 8, 24, 1, 2, false, 3));
        assertThat(result.status()).isEqualTo("ACTIVATE_DELEGATION");
        assertThat(result.delegatedAssignments()).isPositive();
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void escalatesSegregationConflict() {
        var result = service.route(new ApprovalDelegationService.Request(20, 26, 24, 1, 2, true, 5));
        assertThat(result.status()).isEqualTo("ESCALATE");
        assertThat(result.delegatedAssignments()).isZero();
    }
}
