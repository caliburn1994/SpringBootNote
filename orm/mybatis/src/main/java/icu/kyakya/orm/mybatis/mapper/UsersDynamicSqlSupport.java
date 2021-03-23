package icu.kyakya.orm.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.id")
    public static final SqlColumn<Integer> id = users.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email")
    public static final SqlColumn<String> email = users.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_password")
    public static final SqlColumn<String> encryptedPassword = users.encryptedPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_token")
    public static final SqlColumn<String> resetPasswordToken = users.resetPasswordToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_sent_at")
    public static final SqlColumn<Date> resetPasswordSentAt = users.resetPasswordSentAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.remember_created_at")
    public static final SqlColumn<Date> rememberCreatedAt = users.rememberCreatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.sign_in_count")
    public static final SqlColumn<Integer> signInCount = users.signInCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_at")
    public static final SqlColumn<Date> currentSignInAt = users.currentSignInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_at")
    public static final SqlColumn<Date> lastSignInAt = users.lastSignInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_ip")
    public static final SqlColumn<String> currentSignInIp = users.currentSignInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_ip")
    public static final SqlColumn<String> lastSignInIp = users.lastSignInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_at")
    public static final SqlColumn<Date> createdAt = users.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.updated_at")
    public static final SqlColumn<Date> updatedAt = users.updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.name")
    public static final SqlColumn<String> name = users.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin")
    public static final SqlColumn<Boolean> admin = users.admin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.projects_limit")
    public static final SqlColumn<Integer> projectsLimit = users.projectsLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.skype")
    public static final SqlColumn<String> skype = users.skype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.linkedin")
    public static final SqlColumn<String> linkedin = users.linkedin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.twitter")
    public static final SqlColumn<String> twitter = users.twitter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.failed_attempts")
    public static final SqlColumn<Integer> failedAttempts = users.failedAttempts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.locked_at")
    public static final SqlColumn<Date> lockedAt = users.lockedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.username")
    public static final SqlColumn<String> username = users.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_group")
    public static final SqlColumn<Boolean> canCreateGroup = users.canCreateGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_team")
    public static final SqlColumn<Boolean> canCreateTeam = users.canCreateTeam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.state")
    public static final SqlColumn<String> state = users.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.color_scheme_id")
    public static final SqlColumn<Integer> colorSchemeId = users.colorSchemeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_expires_at")
    public static final SqlColumn<Date> passwordExpiresAt = users.passwordExpiresAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_by_id")
    public static final SqlColumn<Integer> createdById = users.createdById;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_credential_check_at")
    public static final SqlColumn<Date> lastCredentialCheckAt = users.lastCredentialCheckAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.avatar")
    public static final SqlColumn<String> avatar = users.avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_token")
    public static final SqlColumn<String> confirmationToken = users.confirmationToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmed_at")
    public static final SqlColumn<Date> confirmedAt = users.confirmedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_sent_at")
    public static final SqlColumn<Date> confirmationSentAt = users.confirmationSentAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unconfirmed_email")
    public static final SqlColumn<String> unconfirmedEmail = users.unconfirmedEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_ssh_key")
    public static final SqlColumn<Boolean> hideNoSshKey = users.hideNoSshKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.website_url")
    public static final SqlColumn<String> websiteUrl = users.websiteUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin_email_unsubscribed_at")
    public static final SqlColumn<Date> adminEmailUnsubscribedAt = users.adminEmailUnsubscribedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notification_email")
    public static final SqlColumn<String> notificationEmail = users.notificationEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_password")
    public static final SqlColumn<Boolean> hideNoPassword = users.hideNoPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_automatically_set")
    public static final SqlColumn<Boolean> passwordAutomaticallySet = users.passwordAutomaticallySet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.location")
    public static final SqlColumn<String> location = users.location;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret")
    public static final SqlColumn<String> encryptedOtpSecret = users.encryptedOtpSecret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_iv")
    public static final SqlColumn<String> encryptedOtpSecretIv = users.encryptedOtpSecretIv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_salt")
    public static final SqlColumn<String> encryptedOtpSecretSalt = users.encryptedOtpSecretSalt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_required_for_login")
    public static final SqlColumn<Boolean> otpRequiredForLogin = users.otpRequiredForLogin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_backup_codes")
    public static final SqlColumn<String> otpBackupCodes = users.otpBackupCodes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.public_email")
    public static final SqlColumn<String> publicEmail = users.publicEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.dashboard")
    public static final SqlColumn<Integer> dashboard = users.dashboard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.project_view")
    public static final SqlColumn<Integer> projectView = users.projectView;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.consumed_timestep")
    public static final SqlColumn<Integer> consumedTimestep = users.consumedTimestep;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.layout")
    public static final SqlColumn<Integer> layout = users.layout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_project_limit")
    public static final SqlColumn<Boolean> hideProjectLimit = users.hideProjectLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.note")
    public static final SqlColumn<String> note = users.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unlock_token")
    public static final SqlColumn<String> unlockToken = users.unlockToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_grace_period_started_at")
    public static final SqlColumn<Date> otpGracePeriodStartedAt = users.otpGracePeriodStartedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.external")
    public static final SqlColumn<Boolean> external = users.external;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.incoming_email_token")
    public static final SqlColumn<String> incomingEmailToken = users.incomingEmailToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.organization")
    public static final SqlColumn<String> organization = users.organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.auditor")
    public static final SqlColumn<Boolean> auditor = users.auditor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.require_two_factor_authentication_from_group")
    public static final SqlColumn<Boolean> requireTwoFactorAuthenticationFromGroup = users.requireTwoFactorAuthenticationFromGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.two_factor_grace_period")
    public static final SqlColumn<Integer> twoFactorGracePeriod = users.twoFactorGracePeriod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_activity_on")
    public static final SqlColumn<Date> lastActivityOn = users.lastActivityOn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notified_of_own_activity")
    public static final SqlColumn<Boolean> notifiedOfOwnActivity = users.notifiedOfOwnActivity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.preferred_language")
    public static final SqlColumn<String> preferredLanguage = users.preferredLanguage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in")
    public static final SqlColumn<Boolean> emailOptedIn = users.emailOptedIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_ip")
    public static final SqlColumn<String> emailOptedInIp = users.emailOptedInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_source_id")
    public static final SqlColumn<Integer> emailOptedInSourceId = users.emailOptedInSourceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_at")
    public static final SqlColumn<Date> emailOptedInAt = users.emailOptedInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.theme_id")
    public static final SqlColumn<Short> themeId = users.themeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.accepted_term_id")
    public static final SqlColumn<Integer> acceptedTermId = users.acceptedTermId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.feed_token")
    public static final SqlColumn<String> feedToken = users.feedToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.private_profile")
    public static final SqlColumn<Boolean> privateProfile = users.privateProfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.roadmap_layout")
    public static final SqlColumn<Short> roadmapLayout = users.roadmapLayout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.include_private_contributions")
    public static final SqlColumn<Boolean> includePrivateContributions = users.includePrivateContributions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.commit_email")
    public static final SqlColumn<String> commitEmail = users.commitEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.group_view")
    public static final SqlColumn<Integer> groupView = users.groupView;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.managing_group_id")
    public static final SqlColumn<Integer> managingGroupId = users.managingGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.first_name")
    public static final SqlColumn<String> firstName = users.firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_name")
    public static final SqlColumn<String> lastName = users.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.static_object_token")
    public static final SqlColumn<String> staticObjectToken = users.staticObjectToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.role")
    public static final SqlColumn<Short> role = users.role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.user_type")
    public static final SqlColumn<Short> userType = users.userType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    public static final class Users extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> encryptedPassword = column("encrypted_password", JDBCType.VARCHAR);

        public final SqlColumn<String> resetPasswordToken = column("reset_password_token", JDBCType.VARCHAR);

        public final SqlColumn<Date> resetPasswordSentAt = column("reset_password_sent_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> rememberCreatedAt = column("remember_created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> signInCount = column("sign_in_count", JDBCType.INTEGER);

        public final SqlColumn<Date> currentSignInAt = column("current_sign_in_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSignInAt = column("last_sign_in_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> currentSignInIp = column("current_sign_in_ip", JDBCType.VARCHAR);

        public final SqlColumn<String> lastSignInIp = column("last_sign_in_ip", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> admin = column("admin", JDBCType.BIT);

        public final SqlColumn<Integer> projectsLimit = column("projects_limit", JDBCType.INTEGER);

        public final SqlColumn<String> skype = column("skype", JDBCType.VARCHAR);

        public final SqlColumn<String> linkedin = column("linkedin", JDBCType.VARCHAR);

        public final SqlColumn<String> twitter = column("twitter", JDBCType.VARCHAR);

        public final SqlColumn<Integer> failedAttempts = column("failed_attempts", JDBCType.INTEGER);

        public final SqlColumn<Date> lockedAt = column("locked_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> canCreateGroup = column("can_create_group", JDBCType.BIT);

        public final SqlColumn<Boolean> canCreateTeam = column("can_create_team", JDBCType.BIT);

        public final SqlColumn<String> state = column("state", JDBCType.VARCHAR);

        public final SqlColumn<Integer> colorSchemeId = column("color_scheme_id", JDBCType.INTEGER);

        public final SqlColumn<Date> passwordExpiresAt = column("password_expires_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> createdById = column("created_by_id", JDBCType.INTEGER);

        public final SqlColumn<Date> lastCredentialCheckAt = column("last_credential_check_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> avatar = column("avatar", JDBCType.VARCHAR);

        public final SqlColumn<String> confirmationToken = column("confirmation_token", JDBCType.VARCHAR);

        public final SqlColumn<Date> confirmedAt = column("confirmed_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> confirmationSentAt = column("confirmation_sent_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> unconfirmedEmail = column("unconfirmed_email", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> hideNoSshKey = column("hide_no_ssh_key", JDBCType.BIT);

        public final SqlColumn<String> websiteUrl = column("website_url", JDBCType.VARCHAR);

        public final SqlColumn<Date> adminEmailUnsubscribedAt = column("admin_email_unsubscribed_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> notificationEmail = column("notification_email", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> hideNoPassword = column("hide_no_password", JDBCType.BIT);

        public final SqlColumn<Boolean> passwordAutomaticallySet = column("password_automatically_set", JDBCType.BIT);

        public final SqlColumn<String> location = column("location", JDBCType.VARCHAR);

        public final SqlColumn<String> encryptedOtpSecret = column("encrypted_otp_secret", JDBCType.VARCHAR);

        public final SqlColumn<String> encryptedOtpSecretIv = column("encrypted_otp_secret_iv", JDBCType.VARCHAR);

        public final SqlColumn<String> encryptedOtpSecretSalt = column("encrypted_otp_secret_salt", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> otpRequiredForLogin = column("otp_required_for_login", JDBCType.BIT);

        public final SqlColumn<String> otpBackupCodes = column("otp_backup_codes", JDBCType.VARCHAR);

        public final SqlColumn<String> publicEmail = column("public_email", JDBCType.VARCHAR);

        public final SqlColumn<Integer> dashboard = column("dashboard", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectView = column("project_view", JDBCType.INTEGER);

        public final SqlColumn<Integer> consumedTimestep = column("consumed_timestep", JDBCType.INTEGER);

        public final SqlColumn<Integer> layout = column("layout", JDBCType.INTEGER);

        public final SqlColumn<Boolean> hideProjectLimit = column("hide_project_limit", JDBCType.BIT);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> unlockToken = column("unlock_token", JDBCType.VARCHAR);

        public final SqlColumn<Date> otpGracePeriodStartedAt = column("otp_grace_period_started_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> external = column("external", JDBCType.BIT);

        public final SqlColumn<String> incomingEmailToken = column("incoming_email_token", JDBCType.VARCHAR);

        public final SqlColumn<String> organization = column("organization", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> auditor = column("auditor", JDBCType.BIT);

        public final SqlColumn<Boolean> requireTwoFactorAuthenticationFromGroup = column("require_two_factor_authentication_from_group", JDBCType.BIT);

        public final SqlColumn<Integer> twoFactorGracePeriod = column("two_factor_grace_period", JDBCType.INTEGER);

        public final SqlColumn<Date> lastActivityOn = column("last_activity_on", JDBCType.DATE);

        public final SqlColumn<Boolean> notifiedOfOwnActivity = column("notified_of_own_activity", JDBCType.BIT);

        public final SqlColumn<String> preferredLanguage = column("preferred_language", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> emailOptedIn = column("email_opted_in", JDBCType.BIT);

        public final SqlColumn<String> emailOptedInIp = column("email_opted_in_ip", JDBCType.VARCHAR);

        public final SqlColumn<Integer> emailOptedInSourceId = column("email_opted_in_source_id", JDBCType.INTEGER);

        public final SqlColumn<Date> emailOptedInAt = column("email_opted_in_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Short> themeId = column("theme_id", JDBCType.SMALLINT);

        public final SqlColumn<Integer> acceptedTermId = column("accepted_term_id", JDBCType.INTEGER);

        public final SqlColumn<String> feedToken = column("feed_token", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> privateProfile = column("private_profile", JDBCType.BIT);

        public final SqlColumn<Short> roadmapLayout = column("roadmap_layout", JDBCType.SMALLINT);

        public final SqlColumn<Boolean> includePrivateContributions = column("include_private_contributions", JDBCType.BIT);

        public final SqlColumn<String> commitEmail = column("commit_email", JDBCType.VARCHAR);

        public final SqlColumn<Integer> groupView = column("group_view", JDBCType.INTEGER);

        public final SqlColumn<Integer> managingGroupId = column("managing_group_id", JDBCType.INTEGER);

        public final SqlColumn<String> firstName = column("first_name", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("last_name", JDBCType.VARCHAR);

        public final SqlColumn<String> staticObjectToken = column("static_object_token", JDBCType.VARCHAR);

        public final SqlColumn<Short> role = column("role", JDBCType.SMALLINT);

        public final SqlColumn<Short> userType = column("user_type", JDBCType.SMALLINT);

        public Users() {
            super("users");
        }
    }
}