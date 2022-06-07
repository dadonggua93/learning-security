package org.example.security.common.constant;

/**
 * @author ：sunjx
 * @date ：Created in 2020/6/4 17:21
 * @description：
 */
public interface ErrorConstant
{

    // admin
    String LOGIN_FIRST = "请先登录";
    String REGISTER_FIRST = "请先注册";
    String ERROR_USER_INFO = "用户信息有误";
    String ERROR_USERORPWD = "用户名或密码错误";
    String ERROR_PASSWORD = "旧密码有误";
    String USERNAME_PATTERN_FAILD = "用户名必须为6-20长度的字符串";
    String MISSED_AUTHORITY = "没有权限";
    String MISSED_ROLE_AUTHORITY = "没有权限，需要[%s]角色";

    String MISSED_USER = "用户不存在";
    String BANNED_USER = "该用户已被封禁";
    String DEL_ROLE_WITHUSER = "存在该角色用户，无法删除";
    String REPET_USERNAME = "用户名重复";
    String REPET_PHONE = "手机号重复";
    String REPET_THIRD_PART_WECHAT = "该微信账号已绑定，请直接登录";
    String REPET_THIRD_PART_QQ = "该QQ账号已绑定，请直接登录";
    String REPET_THIRD_PART_IOS = "该IOS账号已绑定，请直接登录";
    String LOGIN_FAILED = "登录失败";
    String REPET_THIRD_PART_WECHAT_TO_BINDDOWN = "该微信账号已绑定，请直接登录或解绑";
    String REPET_THIRD_PART_QQ_TO_BINDDOWN = "该QQ账号已绑定，请直接登录或解绑";
    String REPET_THIRD_PART_IOS_TO_BINDDOWN = "该IOS账号已绑定，请直接登录或解绑";
    String IOS_TOKEN_TIMEOUT = "该token已超时，请重新获取";
    String AUTH_FAILD = "认证失败";
    String BBS_ROLE_UNREMOVEABLE = "不可删除默认的角色";


    // base
    String NONE_DATA = "暂无数据";
    String CUD_FAILD = "请刷新数据重新操作";
    String ERROR_PARAM = "参数错误";
    String ERROR_CRON = "cron 表达式格式有误";
    String ERROR_SERVER_ADDRESS = "服务地址有误";
    String ERROR_CRAW_REQUEST = "scrapy schedule 请求有误";
    String ERROR_REQ = "请求失败";
    String ERROR_PHONE = "手机号有误";
    String ERROR_SMS_CODE = "短信验证码有误";
    String MISSED_SMS_CEDODE = "短信验证码有误或已经失效";
    String MISSED_SCRAPY_PROJECT = "没有此project:";
    String REPEAT_CRAW_KEY = "已有相同爬虫key数据";
    String REPET_DATA = "有重复数据，请检查";
    String REPET_REQ = "不可重复操作";
    String TOO_MANY_REQ = "操作过频，请3分钟后再试";
    String URL_ERROR = "无效url";
    String REMOTE_FILE_UNFOUNT = "未找到远端文件";


    // article
    String MISSED_CLASSIFY = "未找到分类";
    String FIRST_LEVEL_CLASSIFY_CANNOT_USE = "第一级别分类不可挂载文章";
    String UNUSEFUL_CLASSIFY = "该分类存在子项，不可挂载文章";
    String CHILD_NODE_SERVIVE = "尚存在子节点，请先处理子节点关系";
    String MISSED_PARENT_NODE = "未找到父级节点";
    String MISSED_ARTICLE = "该文章不存在";



    // bbs
    String BBS_ARTICLE_UNPUBLISH = "该文章暂未发布";
    String BBS_ARTICLE_UNCOMMENTABLE = "该文章不可评论";
    String BBS_NOTICE_UNCHANGEABLE = "公告已经发布，不允许修改";
    String BBS_USER_FANS_UNREAD = "用户设置粉丝列表不可见";
    String BBS_USER_FOLLOW_UNREAD = "用户设置关注列表不可见";
    String BBS_ARTICLE_BANNED = "该文章已经封禁";
    String BBS_VIOLATION_CHANGE_TIMEOUT = "已超过违规修改最大时间（%s小时）";
    String BBS_FOLLOW_SELF_ERROR = "不可关注自己";
    String BBS_ARTICLE_CONCLUSION = "文章存在违规：[%s]违禁词:[%s]";
    String BBS_FOLLOWING_NONE = "用户关注列表为空";
    String BBS_ARTICLE_NEED_UNPUBLISH = "帖子需要先撤回再编辑";
    String BBS_BANNED_USER = "您已被限制论坛操作，解封时间[%s]";

    String BBS_CLUB_ROLE_MUST_PROFRESSOR = "[%s]用户角色必须是专家角色";
    String BBS_CLUB_LOWER_ONE = "选择板块必须大于1条";
    String BBS_CLUB_LAGER_TWO = "选择板块不得大于2条";
    String BBS_CLUB_LAGER_TWO_WITH_USERS = "[%s]选择板块不得大于2条";
}
