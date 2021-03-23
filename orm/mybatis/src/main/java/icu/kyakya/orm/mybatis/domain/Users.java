package icu.kyakya.orm.mybatis.domain;

import java.util.Date;
import javax.annotation.Generated;

public class Users {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_password")
    private String encryptedPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_token")
    private String resetPasswordToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_sent_at")
    private Date resetPasswordSentAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.remember_created_at")
    private Date rememberCreatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.sign_in_count")
    private Integer signInCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_at")
    private Date currentSignInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_at")
    private Date lastSignInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_ip")
    private String currentSignInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_ip")
    private String lastSignInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_at")
    private Date createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.updated_at")
    private Date updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin")
    private Boolean admin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.projects_limit")
    private Integer projectsLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.skype")
    private String skype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.linkedin")
    private String linkedin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.twitter")
    private String twitter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.failed_attempts")
    private Integer failedAttempts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.locked_at")
    private Date lockedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_group")
    private Boolean canCreateGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_team")
    private Boolean canCreateTeam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.state")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.color_scheme_id")
    private Integer colorSchemeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_expires_at")
    private Date passwordExpiresAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_by_id")
    private Integer createdById;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_credential_check_at")
    private Date lastCredentialCheckAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.avatar")
    private String avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_token")
    private String confirmationToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmed_at")
    private Date confirmedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_sent_at")
    private Date confirmationSentAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unconfirmed_email")
    private String unconfirmedEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_ssh_key")
    private Boolean hideNoSshKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.website_url")
    private String websiteUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin_email_unsubscribed_at")
    private Date adminEmailUnsubscribedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notification_email")
    private String notificationEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_password")
    private Boolean hideNoPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_automatically_set")
    private Boolean passwordAutomaticallySet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.location")
    private String location;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret")
    private String encryptedOtpSecret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_iv")
    private String encryptedOtpSecretIv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_salt")
    private String encryptedOtpSecretSalt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_required_for_login")
    private Boolean otpRequiredForLogin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_backup_codes")
    private String otpBackupCodes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.public_email")
    private String publicEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.dashboard")
    private Integer dashboard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.project_view")
    private Integer projectView;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.consumed_timestep")
    private Integer consumedTimestep;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.layout")
    private Integer layout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_project_limit")
    private Boolean hideProjectLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unlock_token")
    private String unlockToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_grace_period_started_at")
    private Date otpGracePeriodStartedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.external")
    private Boolean external;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.incoming_email_token")
    private String incomingEmailToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.organization")
    private String organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.auditor")
    private Boolean auditor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.require_two_factor_authentication_from_group")
    private Boolean requireTwoFactorAuthenticationFromGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.two_factor_grace_period")
    private Integer twoFactorGracePeriod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_activity_on")
    private Date lastActivityOn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notified_of_own_activity")
    private Boolean notifiedOfOwnActivity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.preferred_language")
    private String preferredLanguage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in")
    private Boolean emailOptedIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_ip")
    private String emailOptedInIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_source_id")
    private Integer emailOptedInSourceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_at")
    private Date emailOptedInAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.theme_id")
    private Short themeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.accepted_term_id")
    private Integer acceptedTermId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.feed_token")
    private String feedToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.private_profile")
    private Boolean privateProfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.roadmap_layout")
    private Short roadmapLayout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.include_private_contributions")
    private Boolean includePrivateContributions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.commit_email")
    private String commitEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.group_view")
    private Integer groupView;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.managing_group_id")
    private Integer managingGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.first_name")
    private String firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_name")
    private String lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.static_object_token")
    private String staticObjectToken;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.role")
    private Short role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.user_type")
    private Short userType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_password")
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_password")
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_token")
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_token")
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_sent_at")
    public Date getResetPasswordSentAt() {
        return resetPasswordSentAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.reset_password_sent_at")
    public void setResetPasswordSentAt(Date resetPasswordSentAt) {
        this.resetPasswordSentAt = resetPasswordSentAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.remember_created_at")
    public Date getRememberCreatedAt() {
        return rememberCreatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.remember_created_at")
    public void setRememberCreatedAt(Date rememberCreatedAt) {
        this.rememberCreatedAt = rememberCreatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.sign_in_count")
    public Integer getSignInCount() {
        return signInCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.sign_in_count")
    public void setSignInCount(Integer signInCount) {
        this.signInCount = signInCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_at")
    public Date getCurrentSignInAt() {
        return currentSignInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_at")
    public void setCurrentSignInAt(Date currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_at")
    public Date getLastSignInAt() {
        return lastSignInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_at")
    public void setLastSignInAt(Date lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_ip")
    public String getCurrentSignInIp() {
        return currentSignInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.current_sign_in_ip")
    public void setCurrentSignInIp(String currentSignInIp) {
        this.currentSignInIp = currentSignInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_ip")
    public String getLastSignInIp() {
        return lastSignInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_sign_in_ip")
    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin")
    public Boolean getAdmin() {
        return admin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.projects_limit")
    public Integer getProjectsLimit() {
        return projectsLimit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.projects_limit")
    public void setProjectsLimit(Integer projectsLimit) {
        this.projectsLimit = projectsLimit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.skype")
    public String getSkype() {
        return skype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.skype")
    public void setSkype(String skype) {
        this.skype = skype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.linkedin")
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.twitter")
    public String getTwitter() {
        return twitter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.failed_attempts")
    public Integer getFailedAttempts() {
        return failedAttempts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.failed_attempts")
    public void setFailedAttempts(Integer failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.locked_at")
    public Date getLockedAt() {
        return lockedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.locked_at")
    public void setLockedAt(Date lockedAt) {
        this.lockedAt = lockedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_group")
    public Boolean getCanCreateGroup() {
        return canCreateGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_group")
    public void setCanCreateGroup(Boolean canCreateGroup) {
        this.canCreateGroup = canCreateGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_team")
    public Boolean getCanCreateTeam() {
        return canCreateTeam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.can_create_team")
    public void setCanCreateTeam(Boolean canCreateTeam) {
        this.canCreateTeam = canCreateTeam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.state")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.state")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.color_scheme_id")
    public Integer getColorSchemeId() {
        return colorSchemeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.color_scheme_id")
    public void setColorSchemeId(Integer colorSchemeId) {
        this.colorSchemeId = colorSchemeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_expires_at")
    public Date getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_expires_at")
    public void setPasswordExpiresAt(Date passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_by_id")
    public Integer getCreatedById() {
        return createdById;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_by_id")
    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_credential_check_at")
    public Date getLastCredentialCheckAt() {
        return lastCredentialCheckAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_credential_check_at")
    public void setLastCredentialCheckAt(Date lastCredentialCheckAt) {
        this.lastCredentialCheckAt = lastCredentialCheckAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.avatar")
    public String getAvatar() {
        return avatar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_token")
    public String getConfirmationToken() {
        return confirmationToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_token")
    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmed_at")
    public Date getConfirmedAt() {
        return confirmedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmed_at")
    public void setConfirmedAt(Date confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_sent_at")
    public Date getConfirmationSentAt() {
        return confirmationSentAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.confirmation_sent_at")
    public void setConfirmationSentAt(Date confirmationSentAt) {
        this.confirmationSentAt = confirmationSentAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unconfirmed_email")
    public String getUnconfirmedEmail() {
        return unconfirmedEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unconfirmed_email")
    public void setUnconfirmedEmail(String unconfirmedEmail) {
        this.unconfirmedEmail = unconfirmedEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_ssh_key")
    public Boolean getHideNoSshKey() {
        return hideNoSshKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_ssh_key")
    public void setHideNoSshKey(Boolean hideNoSshKey) {
        this.hideNoSshKey = hideNoSshKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin_email_unsubscribed_at")
    public Date getAdminEmailUnsubscribedAt() {
        return adminEmailUnsubscribedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.admin_email_unsubscribed_at")
    public void setAdminEmailUnsubscribedAt(Date adminEmailUnsubscribedAt) {
        this.adminEmailUnsubscribedAt = adminEmailUnsubscribedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notification_email")
    public String getNotificationEmail() {
        return notificationEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notification_email")
    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_password")
    public Boolean getHideNoPassword() {
        return hideNoPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_no_password")
    public void setHideNoPassword(Boolean hideNoPassword) {
        this.hideNoPassword = hideNoPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_automatically_set")
    public Boolean getPasswordAutomaticallySet() {
        return passwordAutomaticallySet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password_automatically_set")
    public void setPasswordAutomaticallySet(Boolean passwordAutomaticallySet) {
        this.passwordAutomaticallySet = passwordAutomaticallySet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.location")
    public String getLocation() {
        return location;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.location")
    public void setLocation(String location) {
        this.location = location;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret")
    public String getEncryptedOtpSecret() {
        return encryptedOtpSecret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret")
    public void setEncryptedOtpSecret(String encryptedOtpSecret) {
        this.encryptedOtpSecret = encryptedOtpSecret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_iv")
    public String getEncryptedOtpSecretIv() {
        return encryptedOtpSecretIv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_iv")
    public void setEncryptedOtpSecretIv(String encryptedOtpSecretIv) {
        this.encryptedOtpSecretIv = encryptedOtpSecretIv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_salt")
    public String getEncryptedOtpSecretSalt() {
        return encryptedOtpSecretSalt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.encrypted_otp_secret_salt")
    public void setEncryptedOtpSecretSalt(String encryptedOtpSecretSalt) {
        this.encryptedOtpSecretSalt = encryptedOtpSecretSalt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_required_for_login")
    public Boolean getOtpRequiredForLogin() {
        return otpRequiredForLogin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_required_for_login")
    public void setOtpRequiredForLogin(Boolean otpRequiredForLogin) {
        this.otpRequiredForLogin = otpRequiredForLogin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_backup_codes")
    public String getOtpBackupCodes() {
        return otpBackupCodes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_backup_codes")
    public void setOtpBackupCodes(String otpBackupCodes) {
        this.otpBackupCodes = otpBackupCodes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.public_email")
    public String getPublicEmail() {
        return publicEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.public_email")
    public void setPublicEmail(String publicEmail) {
        this.publicEmail = publicEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.dashboard")
    public Integer getDashboard() {
        return dashboard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.dashboard")
    public void setDashboard(Integer dashboard) {
        this.dashboard = dashboard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.project_view")
    public Integer getProjectView() {
        return projectView;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.project_view")
    public void setProjectView(Integer projectView) {
        this.projectView = projectView;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.consumed_timestep")
    public Integer getConsumedTimestep() {
        return consumedTimestep;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.consumed_timestep")
    public void setConsumedTimestep(Integer consumedTimestep) {
        this.consumedTimestep = consumedTimestep;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.layout")
    public Integer getLayout() {
        return layout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.layout")
    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_project_limit")
    public Boolean getHideProjectLimit() {
        return hideProjectLimit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.hide_project_limit")
    public void setHideProjectLimit(Boolean hideProjectLimit) {
        this.hideProjectLimit = hideProjectLimit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unlock_token")
    public String getUnlockToken() {
        return unlockToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.unlock_token")
    public void setUnlockToken(String unlockToken) {
        this.unlockToken = unlockToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_grace_period_started_at")
    public Date getOtpGracePeriodStartedAt() {
        return otpGracePeriodStartedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.otp_grace_period_started_at")
    public void setOtpGracePeriodStartedAt(Date otpGracePeriodStartedAt) {
        this.otpGracePeriodStartedAt = otpGracePeriodStartedAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.external")
    public Boolean getExternal() {
        return external;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.incoming_email_token")
    public String getIncomingEmailToken() {
        return incomingEmailToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.incoming_email_token")
    public void setIncomingEmailToken(String incomingEmailToken) {
        this.incomingEmailToken = incomingEmailToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.organization")
    public String getOrganization() {
        return organization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.auditor")
    public Boolean getAuditor() {
        return auditor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.auditor")
    public void setAuditor(Boolean auditor) {
        this.auditor = auditor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.require_two_factor_authentication_from_group")
    public Boolean getRequireTwoFactorAuthenticationFromGroup() {
        return requireTwoFactorAuthenticationFromGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.require_two_factor_authentication_from_group")
    public void setRequireTwoFactorAuthenticationFromGroup(Boolean requireTwoFactorAuthenticationFromGroup) {
        this.requireTwoFactorAuthenticationFromGroup = requireTwoFactorAuthenticationFromGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.two_factor_grace_period")
    public Integer getTwoFactorGracePeriod() {
        return twoFactorGracePeriod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.two_factor_grace_period")
    public void setTwoFactorGracePeriod(Integer twoFactorGracePeriod) {
        this.twoFactorGracePeriod = twoFactorGracePeriod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_activity_on")
    public Date getLastActivityOn() {
        return lastActivityOn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_activity_on")
    public void setLastActivityOn(Date lastActivityOn) {
        this.lastActivityOn = lastActivityOn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notified_of_own_activity")
    public Boolean getNotifiedOfOwnActivity() {
        return notifiedOfOwnActivity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.notified_of_own_activity")
    public void setNotifiedOfOwnActivity(Boolean notifiedOfOwnActivity) {
        this.notifiedOfOwnActivity = notifiedOfOwnActivity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.preferred_language")
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.preferred_language")
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in")
    public Boolean getEmailOptedIn() {
        return emailOptedIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in")
    public void setEmailOptedIn(Boolean emailOptedIn) {
        this.emailOptedIn = emailOptedIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_ip")
    public String getEmailOptedInIp() {
        return emailOptedInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_ip")
    public void setEmailOptedInIp(String emailOptedInIp) {
        this.emailOptedInIp = emailOptedInIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_source_id")
    public Integer getEmailOptedInSourceId() {
        return emailOptedInSourceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_source_id")
    public void setEmailOptedInSourceId(Integer emailOptedInSourceId) {
        this.emailOptedInSourceId = emailOptedInSourceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_at")
    public Date getEmailOptedInAt() {
        return emailOptedInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email_opted_in_at")
    public void setEmailOptedInAt(Date emailOptedInAt) {
        this.emailOptedInAt = emailOptedInAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.theme_id")
    public Short getThemeId() {
        return themeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.theme_id")
    public void setThemeId(Short themeId) {
        this.themeId = themeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.accepted_term_id")
    public Integer getAcceptedTermId() {
        return acceptedTermId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.accepted_term_id")
    public void setAcceptedTermId(Integer acceptedTermId) {
        this.acceptedTermId = acceptedTermId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.feed_token")
    public String getFeedToken() {
        return feedToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.feed_token")
    public void setFeedToken(String feedToken) {
        this.feedToken = feedToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.private_profile")
    public Boolean getPrivateProfile() {
        return privateProfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.private_profile")
    public void setPrivateProfile(Boolean privateProfile) {
        this.privateProfile = privateProfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.roadmap_layout")
    public Short getRoadmapLayout() {
        return roadmapLayout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.roadmap_layout")
    public void setRoadmapLayout(Short roadmapLayout) {
        this.roadmapLayout = roadmapLayout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.include_private_contributions")
    public Boolean getIncludePrivateContributions() {
        return includePrivateContributions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.include_private_contributions")
    public void setIncludePrivateContributions(Boolean includePrivateContributions) {
        this.includePrivateContributions = includePrivateContributions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.commit_email")
    public String getCommitEmail() {
        return commitEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.commit_email")
    public void setCommitEmail(String commitEmail) {
        this.commitEmail = commitEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.group_view")
    public Integer getGroupView() {
        return groupView;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.group_view")
    public void setGroupView(Integer groupView) {
        this.groupView = groupView;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.managing_group_id")
    public Integer getManagingGroupId() {
        return managingGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.managing_group_id")
    public void setManagingGroupId(Integer managingGroupId) {
        this.managingGroupId = managingGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.first_name")
    public String getFirstName() {
        return firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_name")
    public String getLastName() {
        return lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.static_object_token")
    public String getStaticObjectToken() {
        return staticObjectToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.static_object_token")
    public void setStaticObjectToken(String staticObjectToken) {
        this.staticObjectToken = staticObjectToken;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.role")
    public Short getRole() {
        return role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.role")
    public void setRole(Short role) {
        this.role = role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.user_type")
    public Short getUserType() {
        return userType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.user_type")
    public void setUserType(Short userType) {
        this.userType = userType;
    }
}