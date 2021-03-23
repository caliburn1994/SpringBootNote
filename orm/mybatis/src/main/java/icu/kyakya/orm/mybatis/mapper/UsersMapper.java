package icu.kyakya.orm.mybatis.mapper;

import static icu.kyakya.orm.mybatis.mapper.UsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import icu.kyakya.orm.mybatis.domain.Users;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UsersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    BasicColumn[] selectList = BasicColumn.columnList(id, email, encryptedPassword, resetPasswordToken, resetPasswordSentAt, rememberCreatedAt, signInCount, currentSignInAt, lastSignInAt, currentSignInIp, lastSignInIp, createdAt, updatedAt, name, admin, projectsLimit, skype, linkedin, twitter, failedAttempts, lockedAt, username, canCreateGroup, canCreateTeam, state, colorSchemeId, passwordExpiresAt, createdById, lastCredentialCheckAt, avatar, confirmationToken, confirmedAt, confirmationSentAt, unconfirmedEmail, hideNoSshKey, websiteUrl, adminEmailUnsubscribedAt, notificationEmail, hideNoPassword, passwordAutomaticallySet, location, encryptedOtpSecret, encryptedOtpSecretIv, encryptedOtpSecretSalt, otpRequiredForLogin, otpBackupCodes, publicEmail, dashboard, projectView, consumedTimestep, layout, hideProjectLimit, note, unlockToken, otpGracePeriodStartedAt, external, incomingEmailToken, organization, auditor, requireTwoFactorAuthenticationFromGroup, twoFactorGracePeriod, lastActivityOn, notifiedOfOwnActivity, preferredLanguage, emailOptedIn, emailOptedInIp, emailOptedInSourceId, emailOptedInAt, themeId, acceptedTermId, feedToken, privateProfile, roadmapLayout, includePrivateContributions, commitEmail, groupView, managingGroupId, firstName, lastName, staticObjectToken, role, userType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Users> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Users> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UsersResult")
    Optional<Users> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_password", property="encryptedPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_password_token", property="resetPasswordToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_password_sent_at", property="resetPasswordSentAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remember_created_at", property="rememberCreatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sign_in_count", property="signInCount", jdbcType=JdbcType.INTEGER),
        @Result(column="current_sign_in_at", property="currentSignInAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_sign_in_at", property="lastSignInAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="current_sign_in_ip", property="currentSignInIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_sign_in_ip", property="lastSignInIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin", property="admin", jdbcType=JdbcType.BIT),
        @Result(column="projects_limit", property="projectsLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="skype", property="skype", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkedin", property="linkedin", jdbcType=JdbcType.VARCHAR),
        @Result(column="twitter", property="twitter", jdbcType=JdbcType.VARCHAR),
        @Result(column="failed_attempts", property="failedAttempts", jdbcType=JdbcType.INTEGER),
        @Result(column="locked_at", property="lockedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="can_create_group", property="canCreateGroup", jdbcType=JdbcType.BIT),
        @Result(column="can_create_team", property="canCreateTeam", jdbcType=JdbcType.BIT),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="color_scheme_id", property="colorSchemeId", jdbcType=JdbcType.INTEGER),
        @Result(column="password_expires_at", property="passwordExpiresAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_by_id", property="createdById", jdbcType=JdbcType.INTEGER),
        @Result(column="last_credential_check_at", property="lastCredentialCheckAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirmation_token", property="confirmationToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirmed_at", property="confirmedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="confirmation_sent_at", property="confirmationSentAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="unconfirmed_email", property="unconfirmedEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="hide_no_ssh_key", property="hideNoSshKey", jdbcType=JdbcType.BIT),
        @Result(column="website_url", property="websiteUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_email_unsubscribed_at", property="adminEmailUnsubscribedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="notification_email", property="notificationEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="hide_no_password", property="hideNoPassword", jdbcType=JdbcType.BIT),
        @Result(column="password_automatically_set", property="passwordAutomaticallySet", jdbcType=JdbcType.BIT),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_otp_secret", property="encryptedOtpSecret", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_otp_secret_iv", property="encryptedOtpSecretIv", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_otp_secret_salt", property="encryptedOtpSecretSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="otp_required_for_login", property="otpRequiredForLogin", jdbcType=JdbcType.BIT),
        @Result(column="otp_backup_codes", property="otpBackupCodes", jdbcType=JdbcType.VARCHAR),
        @Result(column="public_email", property="publicEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="dashboard", property="dashboard", jdbcType=JdbcType.INTEGER),
        @Result(column="project_view", property="projectView", jdbcType=JdbcType.INTEGER),
        @Result(column="consumed_timestep", property="consumedTimestep", jdbcType=JdbcType.INTEGER),
        @Result(column="layout", property="layout", jdbcType=JdbcType.INTEGER),
        @Result(column="hide_project_limit", property="hideProjectLimit", jdbcType=JdbcType.BIT),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="unlock_token", property="unlockToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="otp_grace_period_started_at", property="otpGracePeriodStartedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="external", property="external", jdbcType=JdbcType.BIT),
        @Result(column="incoming_email_token", property="incomingEmailToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="organization", property="organization", jdbcType=JdbcType.VARCHAR),
        @Result(column="auditor", property="auditor", jdbcType=JdbcType.BIT),
        @Result(column="require_two_factor_authentication_from_group", property="requireTwoFactorAuthenticationFromGroup", jdbcType=JdbcType.BIT),
        @Result(column="two_factor_grace_period", property="twoFactorGracePeriod", jdbcType=JdbcType.INTEGER),
        @Result(column="last_activity_on", property="lastActivityOn", jdbcType=JdbcType.DATE),
        @Result(column="notified_of_own_activity", property="notifiedOfOwnActivity", jdbcType=JdbcType.BIT),
        @Result(column="preferred_language", property="preferredLanguage", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_opted_in", property="emailOptedIn", jdbcType=JdbcType.BIT),
        @Result(column="email_opted_in_ip", property="emailOptedInIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_opted_in_source_id", property="emailOptedInSourceId", jdbcType=JdbcType.INTEGER),
        @Result(column="email_opted_in_at", property="emailOptedInAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="theme_id", property="themeId", jdbcType=JdbcType.SMALLINT),
        @Result(column="accepted_term_id", property="acceptedTermId", jdbcType=JdbcType.INTEGER),
        @Result(column="feed_token", property="feedToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="private_profile", property="privateProfile", jdbcType=JdbcType.BIT),
        @Result(column="roadmap_layout", property="roadmapLayout", jdbcType=JdbcType.SMALLINT),
        @Result(column="include_private_contributions", property="includePrivateContributions", jdbcType=JdbcType.BIT),
        @Result(column="commit_email", property="commitEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_view", property="groupView", jdbcType=JdbcType.INTEGER),
        @Result(column="managing_group_id", property="managingGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="static_object_token", property="staticObjectToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.SMALLINT),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.SMALLINT)
    })
    List<Users> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insert(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(id).toProperty("id")
            .map(email).toProperty("email")
            .map(encryptedPassword).toProperty("encryptedPassword")
            .map(resetPasswordToken).toProperty("resetPasswordToken")
            .map(resetPasswordSentAt).toProperty("resetPasswordSentAt")
            .map(rememberCreatedAt).toProperty("rememberCreatedAt")
            .map(signInCount).toProperty("signInCount")
            .map(currentSignInAt).toProperty("currentSignInAt")
            .map(lastSignInAt).toProperty("lastSignInAt")
            .map(currentSignInIp).toProperty("currentSignInIp")
            .map(lastSignInIp).toProperty("lastSignInIp")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(name).toProperty("name")
            .map(admin).toProperty("admin")
            .map(projectsLimit).toProperty("projectsLimit")
            .map(skype).toProperty("skype")
            .map(linkedin).toProperty("linkedin")
            .map(twitter).toProperty("twitter")
            .map(failedAttempts).toProperty("failedAttempts")
            .map(lockedAt).toProperty("lockedAt")
            .map(username).toProperty("username")
            .map(canCreateGroup).toProperty("canCreateGroup")
            .map(canCreateTeam).toProperty("canCreateTeam")
            .map(state).toProperty("state")
            .map(colorSchemeId).toProperty("colorSchemeId")
            .map(passwordExpiresAt).toProperty("passwordExpiresAt")
            .map(createdById).toProperty("createdById")
            .map(lastCredentialCheckAt).toProperty("lastCredentialCheckAt")
            .map(avatar).toProperty("avatar")
            .map(confirmationToken).toProperty("confirmationToken")
            .map(confirmedAt).toProperty("confirmedAt")
            .map(confirmationSentAt).toProperty("confirmationSentAt")
            .map(unconfirmedEmail).toProperty("unconfirmedEmail")
            .map(hideNoSshKey).toProperty("hideNoSshKey")
            .map(websiteUrl).toProperty("websiteUrl")
            .map(adminEmailUnsubscribedAt).toProperty("adminEmailUnsubscribedAt")
            .map(notificationEmail).toProperty("notificationEmail")
            .map(hideNoPassword).toProperty("hideNoPassword")
            .map(passwordAutomaticallySet).toProperty("passwordAutomaticallySet")
            .map(location).toProperty("location")
            .map(encryptedOtpSecret).toProperty("encryptedOtpSecret")
            .map(encryptedOtpSecretIv).toProperty("encryptedOtpSecretIv")
            .map(encryptedOtpSecretSalt).toProperty("encryptedOtpSecretSalt")
            .map(otpRequiredForLogin).toProperty("otpRequiredForLogin")
            .map(otpBackupCodes).toProperty("otpBackupCodes")
            .map(publicEmail).toProperty("publicEmail")
            .map(dashboard).toProperty("dashboard")
            .map(projectView).toProperty("projectView")
            .map(consumedTimestep).toProperty("consumedTimestep")
            .map(layout).toProperty("layout")
            .map(hideProjectLimit).toProperty("hideProjectLimit")
            .map(note).toProperty("note")
            .map(unlockToken).toProperty("unlockToken")
            .map(otpGracePeriodStartedAt).toProperty("otpGracePeriodStartedAt")
            .map(external).toProperty("external")
            .map(incomingEmailToken).toProperty("incomingEmailToken")
            .map(organization).toProperty("organization")
            .map(auditor).toProperty("auditor")
            .map(requireTwoFactorAuthenticationFromGroup).toProperty("requireTwoFactorAuthenticationFromGroup")
            .map(twoFactorGracePeriod).toProperty("twoFactorGracePeriod")
            .map(lastActivityOn).toProperty("lastActivityOn")
            .map(notifiedOfOwnActivity).toProperty("notifiedOfOwnActivity")
            .map(preferredLanguage).toProperty("preferredLanguage")
            .map(emailOptedIn).toProperty("emailOptedIn")
            .map(emailOptedInIp).toProperty("emailOptedInIp")
            .map(emailOptedInSourceId).toProperty("emailOptedInSourceId")
            .map(emailOptedInAt).toProperty("emailOptedInAt")
            .map(themeId).toProperty("themeId")
            .map(acceptedTermId).toProperty("acceptedTermId")
            .map(feedToken).toProperty("feedToken")
            .map(privateProfile).toProperty("privateProfile")
            .map(roadmapLayout).toProperty("roadmapLayout")
            .map(includePrivateContributions).toProperty("includePrivateContributions")
            .map(commitEmail).toProperty("commitEmail")
            .map(groupView).toProperty("groupView")
            .map(managingGroupId).toProperty("managingGroupId")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(staticObjectToken).toProperty("staticObjectToken")
            .map(role).toProperty("role")
            .map(userType).toProperty("userType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insertMultiple(Collection<Users> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, users, c ->
            c.map(id).toProperty("id")
            .map(email).toProperty("email")
            .map(encryptedPassword).toProperty("encryptedPassword")
            .map(resetPasswordToken).toProperty("resetPasswordToken")
            .map(resetPasswordSentAt).toProperty("resetPasswordSentAt")
            .map(rememberCreatedAt).toProperty("rememberCreatedAt")
            .map(signInCount).toProperty("signInCount")
            .map(currentSignInAt).toProperty("currentSignInAt")
            .map(lastSignInAt).toProperty("lastSignInAt")
            .map(currentSignInIp).toProperty("currentSignInIp")
            .map(lastSignInIp).toProperty("lastSignInIp")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(name).toProperty("name")
            .map(admin).toProperty("admin")
            .map(projectsLimit).toProperty("projectsLimit")
            .map(skype).toProperty("skype")
            .map(linkedin).toProperty("linkedin")
            .map(twitter).toProperty("twitter")
            .map(failedAttempts).toProperty("failedAttempts")
            .map(lockedAt).toProperty("lockedAt")
            .map(username).toProperty("username")
            .map(canCreateGroup).toProperty("canCreateGroup")
            .map(canCreateTeam).toProperty("canCreateTeam")
            .map(state).toProperty("state")
            .map(colorSchemeId).toProperty("colorSchemeId")
            .map(passwordExpiresAt).toProperty("passwordExpiresAt")
            .map(createdById).toProperty("createdById")
            .map(lastCredentialCheckAt).toProperty("lastCredentialCheckAt")
            .map(avatar).toProperty("avatar")
            .map(confirmationToken).toProperty("confirmationToken")
            .map(confirmedAt).toProperty("confirmedAt")
            .map(confirmationSentAt).toProperty("confirmationSentAt")
            .map(unconfirmedEmail).toProperty("unconfirmedEmail")
            .map(hideNoSshKey).toProperty("hideNoSshKey")
            .map(websiteUrl).toProperty("websiteUrl")
            .map(adminEmailUnsubscribedAt).toProperty("adminEmailUnsubscribedAt")
            .map(notificationEmail).toProperty("notificationEmail")
            .map(hideNoPassword).toProperty("hideNoPassword")
            .map(passwordAutomaticallySet).toProperty("passwordAutomaticallySet")
            .map(location).toProperty("location")
            .map(encryptedOtpSecret).toProperty("encryptedOtpSecret")
            .map(encryptedOtpSecretIv).toProperty("encryptedOtpSecretIv")
            .map(encryptedOtpSecretSalt).toProperty("encryptedOtpSecretSalt")
            .map(otpRequiredForLogin).toProperty("otpRequiredForLogin")
            .map(otpBackupCodes).toProperty("otpBackupCodes")
            .map(publicEmail).toProperty("publicEmail")
            .map(dashboard).toProperty("dashboard")
            .map(projectView).toProperty("projectView")
            .map(consumedTimestep).toProperty("consumedTimestep")
            .map(layout).toProperty("layout")
            .map(hideProjectLimit).toProperty("hideProjectLimit")
            .map(note).toProperty("note")
            .map(unlockToken).toProperty("unlockToken")
            .map(otpGracePeriodStartedAt).toProperty("otpGracePeriodStartedAt")
            .map(external).toProperty("external")
            .map(incomingEmailToken).toProperty("incomingEmailToken")
            .map(organization).toProperty("organization")
            .map(auditor).toProperty("auditor")
            .map(requireTwoFactorAuthenticationFromGroup).toProperty("requireTwoFactorAuthenticationFromGroup")
            .map(twoFactorGracePeriod).toProperty("twoFactorGracePeriod")
            .map(lastActivityOn).toProperty("lastActivityOn")
            .map(notifiedOfOwnActivity).toProperty("notifiedOfOwnActivity")
            .map(preferredLanguage).toProperty("preferredLanguage")
            .map(emailOptedIn).toProperty("emailOptedIn")
            .map(emailOptedInIp).toProperty("emailOptedInIp")
            .map(emailOptedInSourceId).toProperty("emailOptedInSourceId")
            .map(emailOptedInAt).toProperty("emailOptedInAt")
            .map(themeId).toProperty("themeId")
            .map(acceptedTermId).toProperty("acceptedTermId")
            .map(feedToken).toProperty("feedToken")
            .map(privateProfile).toProperty("privateProfile")
            .map(roadmapLayout).toProperty("roadmapLayout")
            .map(includePrivateContributions).toProperty("includePrivateContributions")
            .map(commitEmail).toProperty("commitEmail")
            .map(groupView).toProperty("groupView")
            .map(managingGroupId).toProperty("managingGroupId")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(staticObjectToken).toProperty("staticObjectToken")
            .map(role).toProperty("role")
            .map(userType).toProperty("userType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insertSelective(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(encryptedPassword).toPropertyWhenPresent("encryptedPassword", record::getEncryptedPassword)
            .map(resetPasswordToken).toPropertyWhenPresent("resetPasswordToken", record::getResetPasswordToken)
            .map(resetPasswordSentAt).toPropertyWhenPresent("resetPasswordSentAt", record::getResetPasswordSentAt)
            .map(rememberCreatedAt).toPropertyWhenPresent("rememberCreatedAt", record::getRememberCreatedAt)
            .map(signInCount).toPropertyWhenPresent("signInCount", record::getSignInCount)
            .map(currentSignInAt).toPropertyWhenPresent("currentSignInAt", record::getCurrentSignInAt)
            .map(lastSignInAt).toPropertyWhenPresent("lastSignInAt", record::getLastSignInAt)
            .map(currentSignInIp).toPropertyWhenPresent("currentSignInIp", record::getCurrentSignInIp)
            .map(lastSignInIp).toPropertyWhenPresent("lastSignInIp", record::getLastSignInIp)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(admin).toPropertyWhenPresent("admin", record::getAdmin)
            .map(projectsLimit).toPropertyWhenPresent("projectsLimit", record::getProjectsLimit)
            .map(skype).toPropertyWhenPresent("skype", record::getSkype)
            .map(linkedin).toPropertyWhenPresent("linkedin", record::getLinkedin)
            .map(twitter).toPropertyWhenPresent("twitter", record::getTwitter)
            .map(failedAttempts).toPropertyWhenPresent("failedAttempts", record::getFailedAttempts)
            .map(lockedAt).toPropertyWhenPresent("lockedAt", record::getLockedAt)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(canCreateGroup).toPropertyWhenPresent("canCreateGroup", record::getCanCreateGroup)
            .map(canCreateTeam).toPropertyWhenPresent("canCreateTeam", record::getCanCreateTeam)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(colorSchemeId).toPropertyWhenPresent("colorSchemeId", record::getColorSchemeId)
            .map(passwordExpiresAt).toPropertyWhenPresent("passwordExpiresAt", record::getPasswordExpiresAt)
            .map(createdById).toPropertyWhenPresent("createdById", record::getCreatedById)
            .map(lastCredentialCheckAt).toPropertyWhenPresent("lastCredentialCheckAt", record::getLastCredentialCheckAt)
            .map(avatar).toPropertyWhenPresent("avatar", record::getAvatar)
            .map(confirmationToken).toPropertyWhenPresent("confirmationToken", record::getConfirmationToken)
            .map(confirmedAt).toPropertyWhenPresent("confirmedAt", record::getConfirmedAt)
            .map(confirmationSentAt).toPropertyWhenPresent("confirmationSentAt", record::getConfirmationSentAt)
            .map(unconfirmedEmail).toPropertyWhenPresent("unconfirmedEmail", record::getUnconfirmedEmail)
            .map(hideNoSshKey).toPropertyWhenPresent("hideNoSshKey", record::getHideNoSshKey)
            .map(websiteUrl).toPropertyWhenPresent("websiteUrl", record::getWebsiteUrl)
            .map(adminEmailUnsubscribedAt).toPropertyWhenPresent("adminEmailUnsubscribedAt", record::getAdminEmailUnsubscribedAt)
            .map(notificationEmail).toPropertyWhenPresent("notificationEmail", record::getNotificationEmail)
            .map(hideNoPassword).toPropertyWhenPresent("hideNoPassword", record::getHideNoPassword)
            .map(passwordAutomaticallySet).toPropertyWhenPresent("passwordAutomaticallySet", record::getPasswordAutomaticallySet)
            .map(location).toPropertyWhenPresent("location", record::getLocation)
            .map(encryptedOtpSecret).toPropertyWhenPresent("encryptedOtpSecret", record::getEncryptedOtpSecret)
            .map(encryptedOtpSecretIv).toPropertyWhenPresent("encryptedOtpSecretIv", record::getEncryptedOtpSecretIv)
            .map(encryptedOtpSecretSalt).toPropertyWhenPresent("encryptedOtpSecretSalt", record::getEncryptedOtpSecretSalt)
            .map(otpRequiredForLogin).toPropertyWhenPresent("otpRequiredForLogin", record::getOtpRequiredForLogin)
            .map(otpBackupCodes).toPropertyWhenPresent("otpBackupCodes", record::getOtpBackupCodes)
            .map(publicEmail).toPropertyWhenPresent("publicEmail", record::getPublicEmail)
            .map(dashboard).toPropertyWhenPresent("dashboard", record::getDashboard)
            .map(projectView).toPropertyWhenPresent("projectView", record::getProjectView)
            .map(consumedTimestep).toPropertyWhenPresent("consumedTimestep", record::getConsumedTimestep)
            .map(layout).toPropertyWhenPresent("layout", record::getLayout)
            .map(hideProjectLimit).toPropertyWhenPresent("hideProjectLimit", record::getHideProjectLimit)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(unlockToken).toPropertyWhenPresent("unlockToken", record::getUnlockToken)
            .map(otpGracePeriodStartedAt).toPropertyWhenPresent("otpGracePeriodStartedAt", record::getOtpGracePeriodStartedAt)
            .map(external).toPropertyWhenPresent("external", record::getExternal)
            .map(incomingEmailToken).toPropertyWhenPresent("incomingEmailToken", record::getIncomingEmailToken)
            .map(organization).toPropertyWhenPresent("organization", record::getOrganization)
            .map(auditor).toPropertyWhenPresent("auditor", record::getAuditor)
            .map(requireTwoFactorAuthenticationFromGroup).toPropertyWhenPresent("requireTwoFactorAuthenticationFromGroup", record::getRequireTwoFactorAuthenticationFromGroup)
            .map(twoFactorGracePeriod).toPropertyWhenPresent("twoFactorGracePeriod", record::getTwoFactorGracePeriod)
            .map(lastActivityOn).toPropertyWhenPresent("lastActivityOn", record::getLastActivityOn)
            .map(notifiedOfOwnActivity).toPropertyWhenPresent("notifiedOfOwnActivity", record::getNotifiedOfOwnActivity)
            .map(preferredLanguage).toPropertyWhenPresent("preferredLanguage", record::getPreferredLanguage)
            .map(emailOptedIn).toPropertyWhenPresent("emailOptedIn", record::getEmailOptedIn)
            .map(emailOptedInIp).toPropertyWhenPresent("emailOptedInIp", record::getEmailOptedInIp)
            .map(emailOptedInSourceId).toPropertyWhenPresent("emailOptedInSourceId", record::getEmailOptedInSourceId)
            .map(emailOptedInAt).toPropertyWhenPresent("emailOptedInAt", record::getEmailOptedInAt)
            .map(themeId).toPropertyWhenPresent("themeId", record::getThemeId)
            .map(acceptedTermId).toPropertyWhenPresent("acceptedTermId", record::getAcceptedTermId)
            .map(feedToken).toPropertyWhenPresent("feedToken", record::getFeedToken)
            .map(privateProfile).toPropertyWhenPresent("privateProfile", record::getPrivateProfile)
            .map(roadmapLayout).toPropertyWhenPresent("roadmapLayout", record::getRoadmapLayout)
            .map(includePrivateContributions).toPropertyWhenPresent("includePrivateContributions", record::getIncludePrivateContributions)
            .map(commitEmail).toPropertyWhenPresent("commitEmail", record::getCommitEmail)
            .map(groupView).toPropertyWhenPresent("groupView", record::getGroupView)
            .map(managingGroupId).toPropertyWhenPresent("managingGroupId", record::getManagingGroupId)
            .map(firstName).toPropertyWhenPresent("firstName", record::getFirstName)
            .map(lastName).toPropertyWhenPresent("lastName", record::getLastName)
            .map(staticObjectToken).toPropertyWhenPresent("staticObjectToken", record::getStaticObjectToken)
            .map(role).toPropertyWhenPresent("role", record::getRole)
            .map(userType).toPropertyWhenPresent("userType", record::getUserType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default Optional<Users> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default List<Users> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default List<Users> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default Optional<Users> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateAllColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(email).equalTo(record::getEmail)
                .set(encryptedPassword).equalTo(record::getEncryptedPassword)
                .set(resetPasswordToken).equalTo(record::getResetPasswordToken)
                .set(resetPasswordSentAt).equalTo(record::getResetPasswordSentAt)
                .set(rememberCreatedAt).equalTo(record::getRememberCreatedAt)
                .set(signInCount).equalTo(record::getSignInCount)
                .set(currentSignInAt).equalTo(record::getCurrentSignInAt)
                .set(lastSignInAt).equalTo(record::getLastSignInAt)
                .set(currentSignInIp).equalTo(record::getCurrentSignInIp)
                .set(lastSignInIp).equalTo(record::getLastSignInIp)
                .set(createdAt).equalTo(record::getCreatedAt)
                .set(updatedAt).equalTo(record::getUpdatedAt)
                .set(name).equalTo(record::getName)
                .set(admin).equalTo(record::getAdmin)
                .set(projectsLimit).equalTo(record::getProjectsLimit)
                .set(skype).equalTo(record::getSkype)
                .set(linkedin).equalTo(record::getLinkedin)
                .set(twitter).equalTo(record::getTwitter)
                .set(failedAttempts).equalTo(record::getFailedAttempts)
                .set(lockedAt).equalTo(record::getLockedAt)
                .set(username).equalTo(record::getUsername)
                .set(canCreateGroup).equalTo(record::getCanCreateGroup)
                .set(canCreateTeam).equalTo(record::getCanCreateTeam)
                .set(state).equalTo(record::getState)
                .set(colorSchemeId).equalTo(record::getColorSchemeId)
                .set(passwordExpiresAt).equalTo(record::getPasswordExpiresAt)
                .set(createdById).equalTo(record::getCreatedById)
                .set(lastCredentialCheckAt).equalTo(record::getLastCredentialCheckAt)
                .set(avatar).equalTo(record::getAvatar)
                .set(confirmationToken).equalTo(record::getConfirmationToken)
                .set(confirmedAt).equalTo(record::getConfirmedAt)
                .set(confirmationSentAt).equalTo(record::getConfirmationSentAt)
                .set(unconfirmedEmail).equalTo(record::getUnconfirmedEmail)
                .set(hideNoSshKey).equalTo(record::getHideNoSshKey)
                .set(websiteUrl).equalTo(record::getWebsiteUrl)
                .set(adminEmailUnsubscribedAt).equalTo(record::getAdminEmailUnsubscribedAt)
                .set(notificationEmail).equalTo(record::getNotificationEmail)
                .set(hideNoPassword).equalTo(record::getHideNoPassword)
                .set(passwordAutomaticallySet).equalTo(record::getPasswordAutomaticallySet)
                .set(location).equalTo(record::getLocation)
                .set(encryptedOtpSecret).equalTo(record::getEncryptedOtpSecret)
                .set(encryptedOtpSecretIv).equalTo(record::getEncryptedOtpSecretIv)
                .set(encryptedOtpSecretSalt).equalTo(record::getEncryptedOtpSecretSalt)
                .set(otpRequiredForLogin).equalTo(record::getOtpRequiredForLogin)
                .set(otpBackupCodes).equalTo(record::getOtpBackupCodes)
                .set(publicEmail).equalTo(record::getPublicEmail)
                .set(dashboard).equalTo(record::getDashboard)
                .set(projectView).equalTo(record::getProjectView)
                .set(consumedTimestep).equalTo(record::getConsumedTimestep)
                .set(layout).equalTo(record::getLayout)
                .set(hideProjectLimit).equalTo(record::getHideProjectLimit)
                .set(note).equalTo(record::getNote)
                .set(unlockToken).equalTo(record::getUnlockToken)
                .set(otpGracePeriodStartedAt).equalTo(record::getOtpGracePeriodStartedAt)
                .set(external).equalTo(record::getExternal)
                .set(incomingEmailToken).equalTo(record::getIncomingEmailToken)
                .set(organization).equalTo(record::getOrganization)
                .set(auditor).equalTo(record::getAuditor)
                .set(requireTwoFactorAuthenticationFromGroup).equalTo(record::getRequireTwoFactorAuthenticationFromGroup)
                .set(twoFactorGracePeriod).equalTo(record::getTwoFactorGracePeriod)
                .set(lastActivityOn).equalTo(record::getLastActivityOn)
                .set(notifiedOfOwnActivity).equalTo(record::getNotifiedOfOwnActivity)
                .set(preferredLanguage).equalTo(record::getPreferredLanguage)
                .set(emailOptedIn).equalTo(record::getEmailOptedIn)
                .set(emailOptedInIp).equalTo(record::getEmailOptedInIp)
                .set(emailOptedInSourceId).equalTo(record::getEmailOptedInSourceId)
                .set(emailOptedInAt).equalTo(record::getEmailOptedInAt)
                .set(themeId).equalTo(record::getThemeId)
                .set(acceptedTermId).equalTo(record::getAcceptedTermId)
                .set(feedToken).equalTo(record::getFeedToken)
                .set(privateProfile).equalTo(record::getPrivateProfile)
                .set(roadmapLayout).equalTo(record::getRoadmapLayout)
                .set(includePrivateContributions).equalTo(record::getIncludePrivateContributions)
                .set(commitEmail).equalTo(record::getCommitEmail)
                .set(groupView).equalTo(record::getGroupView)
                .set(managingGroupId).equalTo(record::getManagingGroupId)
                .set(firstName).equalTo(record::getFirstName)
                .set(lastName).equalTo(record::getLastName)
                .set(staticObjectToken).equalTo(record::getStaticObjectToken)
                .set(role).equalTo(record::getRole)
                .set(userType).equalTo(record::getUserType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(encryptedPassword).equalToWhenPresent(record::getEncryptedPassword)
                .set(resetPasswordToken).equalToWhenPresent(record::getResetPasswordToken)
                .set(resetPasswordSentAt).equalToWhenPresent(record::getResetPasswordSentAt)
                .set(rememberCreatedAt).equalToWhenPresent(record::getRememberCreatedAt)
                .set(signInCount).equalToWhenPresent(record::getSignInCount)
                .set(currentSignInAt).equalToWhenPresent(record::getCurrentSignInAt)
                .set(lastSignInAt).equalToWhenPresent(record::getLastSignInAt)
                .set(currentSignInIp).equalToWhenPresent(record::getCurrentSignInIp)
                .set(lastSignInIp).equalToWhenPresent(record::getLastSignInIp)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
                .set(name).equalToWhenPresent(record::getName)
                .set(admin).equalToWhenPresent(record::getAdmin)
                .set(projectsLimit).equalToWhenPresent(record::getProjectsLimit)
                .set(skype).equalToWhenPresent(record::getSkype)
                .set(linkedin).equalToWhenPresent(record::getLinkedin)
                .set(twitter).equalToWhenPresent(record::getTwitter)
                .set(failedAttempts).equalToWhenPresent(record::getFailedAttempts)
                .set(lockedAt).equalToWhenPresent(record::getLockedAt)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(canCreateGroup).equalToWhenPresent(record::getCanCreateGroup)
                .set(canCreateTeam).equalToWhenPresent(record::getCanCreateTeam)
                .set(state).equalToWhenPresent(record::getState)
                .set(colorSchemeId).equalToWhenPresent(record::getColorSchemeId)
                .set(passwordExpiresAt).equalToWhenPresent(record::getPasswordExpiresAt)
                .set(createdById).equalToWhenPresent(record::getCreatedById)
                .set(lastCredentialCheckAt).equalToWhenPresent(record::getLastCredentialCheckAt)
                .set(avatar).equalToWhenPresent(record::getAvatar)
                .set(confirmationToken).equalToWhenPresent(record::getConfirmationToken)
                .set(confirmedAt).equalToWhenPresent(record::getConfirmedAt)
                .set(confirmationSentAt).equalToWhenPresent(record::getConfirmationSentAt)
                .set(unconfirmedEmail).equalToWhenPresent(record::getUnconfirmedEmail)
                .set(hideNoSshKey).equalToWhenPresent(record::getHideNoSshKey)
                .set(websiteUrl).equalToWhenPresent(record::getWebsiteUrl)
                .set(adminEmailUnsubscribedAt).equalToWhenPresent(record::getAdminEmailUnsubscribedAt)
                .set(notificationEmail).equalToWhenPresent(record::getNotificationEmail)
                .set(hideNoPassword).equalToWhenPresent(record::getHideNoPassword)
                .set(passwordAutomaticallySet).equalToWhenPresent(record::getPasswordAutomaticallySet)
                .set(location).equalToWhenPresent(record::getLocation)
                .set(encryptedOtpSecret).equalToWhenPresent(record::getEncryptedOtpSecret)
                .set(encryptedOtpSecretIv).equalToWhenPresent(record::getEncryptedOtpSecretIv)
                .set(encryptedOtpSecretSalt).equalToWhenPresent(record::getEncryptedOtpSecretSalt)
                .set(otpRequiredForLogin).equalToWhenPresent(record::getOtpRequiredForLogin)
                .set(otpBackupCodes).equalToWhenPresent(record::getOtpBackupCodes)
                .set(publicEmail).equalToWhenPresent(record::getPublicEmail)
                .set(dashboard).equalToWhenPresent(record::getDashboard)
                .set(projectView).equalToWhenPresent(record::getProjectView)
                .set(consumedTimestep).equalToWhenPresent(record::getConsumedTimestep)
                .set(layout).equalToWhenPresent(record::getLayout)
                .set(hideProjectLimit).equalToWhenPresent(record::getHideProjectLimit)
                .set(note).equalToWhenPresent(record::getNote)
                .set(unlockToken).equalToWhenPresent(record::getUnlockToken)
                .set(otpGracePeriodStartedAt).equalToWhenPresent(record::getOtpGracePeriodStartedAt)
                .set(external).equalToWhenPresent(record::getExternal)
                .set(incomingEmailToken).equalToWhenPresent(record::getIncomingEmailToken)
                .set(organization).equalToWhenPresent(record::getOrganization)
                .set(auditor).equalToWhenPresent(record::getAuditor)
                .set(requireTwoFactorAuthenticationFromGroup).equalToWhenPresent(record::getRequireTwoFactorAuthenticationFromGroup)
                .set(twoFactorGracePeriod).equalToWhenPresent(record::getTwoFactorGracePeriod)
                .set(lastActivityOn).equalToWhenPresent(record::getLastActivityOn)
                .set(notifiedOfOwnActivity).equalToWhenPresent(record::getNotifiedOfOwnActivity)
                .set(preferredLanguage).equalToWhenPresent(record::getPreferredLanguage)
                .set(emailOptedIn).equalToWhenPresent(record::getEmailOptedIn)
                .set(emailOptedInIp).equalToWhenPresent(record::getEmailOptedInIp)
                .set(emailOptedInSourceId).equalToWhenPresent(record::getEmailOptedInSourceId)
                .set(emailOptedInAt).equalToWhenPresent(record::getEmailOptedInAt)
                .set(themeId).equalToWhenPresent(record::getThemeId)
                .set(acceptedTermId).equalToWhenPresent(record::getAcceptedTermId)
                .set(feedToken).equalToWhenPresent(record::getFeedToken)
                .set(privateProfile).equalToWhenPresent(record::getPrivateProfile)
                .set(roadmapLayout).equalToWhenPresent(record::getRoadmapLayout)
                .set(includePrivateContributions).equalToWhenPresent(record::getIncludePrivateContributions)
                .set(commitEmail).equalToWhenPresent(record::getCommitEmail)
                .set(groupView).equalToWhenPresent(record::getGroupView)
                .set(managingGroupId).equalToWhenPresent(record::getManagingGroupId)
                .set(firstName).equalToWhenPresent(record::getFirstName)
                .set(lastName).equalToWhenPresent(record::getLastName)
                .set(staticObjectToken).equalToWhenPresent(record::getStaticObjectToken)
                .set(role).equalToWhenPresent(record::getRole)
                .set(userType).equalToWhenPresent(record::getUserType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int updateByPrimaryKey(Users record) {
        return update(c ->
            c.set(email).equalTo(record::getEmail)
            .set(encryptedPassword).equalTo(record::getEncryptedPassword)
            .set(resetPasswordToken).equalTo(record::getResetPasswordToken)
            .set(resetPasswordSentAt).equalTo(record::getResetPasswordSentAt)
            .set(rememberCreatedAt).equalTo(record::getRememberCreatedAt)
            .set(signInCount).equalTo(record::getSignInCount)
            .set(currentSignInAt).equalTo(record::getCurrentSignInAt)
            .set(lastSignInAt).equalTo(record::getLastSignInAt)
            .set(currentSignInIp).equalTo(record::getCurrentSignInIp)
            .set(lastSignInIp).equalTo(record::getLastSignInIp)
            .set(createdAt).equalTo(record::getCreatedAt)
            .set(updatedAt).equalTo(record::getUpdatedAt)
            .set(name).equalTo(record::getName)
            .set(admin).equalTo(record::getAdmin)
            .set(projectsLimit).equalTo(record::getProjectsLimit)
            .set(skype).equalTo(record::getSkype)
            .set(linkedin).equalTo(record::getLinkedin)
            .set(twitter).equalTo(record::getTwitter)
            .set(failedAttempts).equalTo(record::getFailedAttempts)
            .set(lockedAt).equalTo(record::getLockedAt)
            .set(username).equalTo(record::getUsername)
            .set(canCreateGroup).equalTo(record::getCanCreateGroup)
            .set(canCreateTeam).equalTo(record::getCanCreateTeam)
            .set(state).equalTo(record::getState)
            .set(colorSchemeId).equalTo(record::getColorSchemeId)
            .set(passwordExpiresAt).equalTo(record::getPasswordExpiresAt)
            .set(createdById).equalTo(record::getCreatedById)
            .set(lastCredentialCheckAt).equalTo(record::getLastCredentialCheckAt)
            .set(avatar).equalTo(record::getAvatar)
            .set(confirmationToken).equalTo(record::getConfirmationToken)
            .set(confirmedAt).equalTo(record::getConfirmedAt)
            .set(confirmationSentAt).equalTo(record::getConfirmationSentAt)
            .set(unconfirmedEmail).equalTo(record::getUnconfirmedEmail)
            .set(hideNoSshKey).equalTo(record::getHideNoSshKey)
            .set(websiteUrl).equalTo(record::getWebsiteUrl)
            .set(adminEmailUnsubscribedAt).equalTo(record::getAdminEmailUnsubscribedAt)
            .set(notificationEmail).equalTo(record::getNotificationEmail)
            .set(hideNoPassword).equalTo(record::getHideNoPassword)
            .set(passwordAutomaticallySet).equalTo(record::getPasswordAutomaticallySet)
            .set(location).equalTo(record::getLocation)
            .set(encryptedOtpSecret).equalTo(record::getEncryptedOtpSecret)
            .set(encryptedOtpSecretIv).equalTo(record::getEncryptedOtpSecretIv)
            .set(encryptedOtpSecretSalt).equalTo(record::getEncryptedOtpSecretSalt)
            .set(otpRequiredForLogin).equalTo(record::getOtpRequiredForLogin)
            .set(otpBackupCodes).equalTo(record::getOtpBackupCodes)
            .set(publicEmail).equalTo(record::getPublicEmail)
            .set(dashboard).equalTo(record::getDashboard)
            .set(projectView).equalTo(record::getProjectView)
            .set(consumedTimestep).equalTo(record::getConsumedTimestep)
            .set(layout).equalTo(record::getLayout)
            .set(hideProjectLimit).equalTo(record::getHideProjectLimit)
            .set(note).equalTo(record::getNote)
            .set(unlockToken).equalTo(record::getUnlockToken)
            .set(otpGracePeriodStartedAt).equalTo(record::getOtpGracePeriodStartedAt)
            .set(external).equalTo(record::getExternal)
            .set(incomingEmailToken).equalTo(record::getIncomingEmailToken)
            .set(organization).equalTo(record::getOrganization)
            .set(auditor).equalTo(record::getAuditor)
            .set(requireTwoFactorAuthenticationFromGroup).equalTo(record::getRequireTwoFactorAuthenticationFromGroup)
            .set(twoFactorGracePeriod).equalTo(record::getTwoFactorGracePeriod)
            .set(lastActivityOn).equalTo(record::getLastActivityOn)
            .set(notifiedOfOwnActivity).equalTo(record::getNotifiedOfOwnActivity)
            .set(preferredLanguage).equalTo(record::getPreferredLanguage)
            .set(emailOptedIn).equalTo(record::getEmailOptedIn)
            .set(emailOptedInIp).equalTo(record::getEmailOptedInIp)
            .set(emailOptedInSourceId).equalTo(record::getEmailOptedInSourceId)
            .set(emailOptedInAt).equalTo(record::getEmailOptedInAt)
            .set(themeId).equalTo(record::getThemeId)
            .set(acceptedTermId).equalTo(record::getAcceptedTermId)
            .set(feedToken).equalTo(record::getFeedToken)
            .set(privateProfile).equalTo(record::getPrivateProfile)
            .set(roadmapLayout).equalTo(record::getRoadmapLayout)
            .set(includePrivateContributions).equalTo(record::getIncludePrivateContributions)
            .set(commitEmail).equalTo(record::getCommitEmail)
            .set(groupView).equalTo(record::getGroupView)
            .set(managingGroupId).equalTo(record::getManagingGroupId)
            .set(firstName).equalTo(record::getFirstName)
            .set(lastName).equalTo(record::getLastName)
            .set(staticObjectToken).equalTo(record::getStaticObjectToken)
            .set(role).equalTo(record::getRole)
            .set(userType).equalTo(record::getUserType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int updateByPrimaryKeySelective(Users record) {
        return update(c ->
            c.set(email).equalToWhenPresent(record::getEmail)
            .set(encryptedPassword).equalToWhenPresent(record::getEncryptedPassword)
            .set(resetPasswordToken).equalToWhenPresent(record::getResetPasswordToken)
            .set(resetPasswordSentAt).equalToWhenPresent(record::getResetPasswordSentAt)
            .set(rememberCreatedAt).equalToWhenPresent(record::getRememberCreatedAt)
            .set(signInCount).equalToWhenPresent(record::getSignInCount)
            .set(currentSignInAt).equalToWhenPresent(record::getCurrentSignInAt)
            .set(lastSignInAt).equalToWhenPresent(record::getLastSignInAt)
            .set(currentSignInIp).equalToWhenPresent(record::getCurrentSignInIp)
            .set(lastSignInIp).equalToWhenPresent(record::getLastSignInIp)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
            .set(name).equalToWhenPresent(record::getName)
            .set(admin).equalToWhenPresent(record::getAdmin)
            .set(projectsLimit).equalToWhenPresent(record::getProjectsLimit)
            .set(skype).equalToWhenPresent(record::getSkype)
            .set(linkedin).equalToWhenPresent(record::getLinkedin)
            .set(twitter).equalToWhenPresent(record::getTwitter)
            .set(failedAttempts).equalToWhenPresent(record::getFailedAttempts)
            .set(lockedAt).equalToWhenPresent(record::getLockedAt)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(canCreateGroup).equalToWhenPresent(record::getCanCreateGroup)
            .set(canCreateTeam).equalToWhenPresent(record::getCanCreateTeam)
            .set(state).equalToWhenPresent(record::getState)
            .set(colorSchemeId).equalToWhenPresent(record::getColorSchemeId)
            .set(passwordExpiresAt).equalToWhenPresent(record::getPasswordExpiresAt)
            .set(createdById).equalToWhenPresent(record::getCreatedById)
            .set(lastCredentialCheckAt).equalToWhenPresent(record::getLastCredentialCheckAt)
            .set(avatar).equalToWhenPresent(record::getAvatar)
            .set(confirmationToken).equalToWhenPresent(record::getConfirmationToken)
            .set(confirmedAt).equalToWhenPresent(record::getConfirmedAt)
            .set(confirmationSentAt).equalToWhenPresent(record::getConfirmationSentAt)
            .set(unconfirmedEmail).equalToWhenPresent(record::getUnconfirmedEmail)
            .set(hideNoSshKey).equalToWhenPresent(record::getHideNoSshKey)
            .set(websiteUrl).equalToWhenPresent(record::getWebsiteUrl)
            .set(adminEmailUnsubscribedAt).equalToWhenPresent(record::getAdminEmailUnsubscribedAt)
            .set(notificationEmail).equalToWhenPresent(record::getNotificationEmail)
            .set(hideNoPassword).equalToWhenPresent(record::getHideNoPassword)
            .set(passwordAutomaticallySet).equalToWhenPresent(record::getPasswordAutomaticallySet)
            .set(location).equalToWhenPresent(record::getLocation)
            .set(encryptedOtpSecret).equalToWhenPresent(record::getEncryptedOtpSecret)
            .set(encryptedOtpSecretIv).equalToWhenPresent(record::getEncryptedOtpSecretIv)
            .set(encryptedOtpSecretSalt).equalToWhenPresent(record::getEncryptedOtpSecretSalt)
            .set(otpRequiredForLogin).equalToWhenPresent(record::getOtpRequiredForLogin)
            .set(otpBackupCodes).equalToWhenPresent(record::getOtpBackupCodes)
            .set(publicEmail).equalToWhenPresent(record::getPublicEmail)
            .set(dashboard).equalToWhenPresent(record::getDashboard)
            .set(projectView).equalToWhenPresent(record::getProjectView)
            .set(consumedTimestep).equalToWhenPresent(record::getConsumedTimestep)
            .set(layout).equalToWhenPresent(record::getLayout)
            .set(hideProjectLimit).equalToWhenPresent(record::getHideProjectLimit)
            .set(note).equalToWhenPresent(record::getNote)
            .set(unlockToken).equalToWhenPresent(record::getUnlockToken)
            .set(otpGracePeriodStartedAt).equalToWhenPresent(record::getOtpGracePeriodStartedAt)
            .set(external).equalToWhenPresent(record::getExternal)
            .set(incomingEmailToken).equalToWhenPresent(record::getIncomingEmailToken)
            .set(organization).equalToWhenPresent(record::getOrganization)
            .set(auditor).equalToWhenPresent(record::getAuditor)
            .set(requireTwoFactorAuthenticationFromGroup).equalToWhenPresent(record::getRequireTwoFactorAuthenticationFromGroup)
            .set(twoFactorGracePeriod).equalToWhenPresent(record::getTwoFactorGracePeriod)
            .set(lastActivityOn).equalToWhenPresent(record::getLastActivityOn)
            .set(notifiedOfOwnActivity).equalToWhenPresent(record::getNotifiedOfOwnActivity)
            .set(preferredLanguage).equalToWhenPresent(record::getPreferredLanguage)
            .set(emailOptedIn).equalToWhenPresent(record::getEmailOptedIn)
            .set(emailOptedInIp).equalToWhenPresent(record::getEmailOptedInIp)
            .set(emailOptedInSourceId).equalToWhenPresent(record::getEmailOptedInSourceId)
            .set(emailOptedInAt).equalToWhenPresent(record::getEmailOptedInAt)
            .set(themeId).equalToWhenPresent(record::getThemeId)
            .set(acceptedTermId).equalToWhenPresent(record::getAcceptedTermId)
            .set(feedToken).equalToWhenPresent(record::getFeedToken)
            .set(privateProfile).equalToWhenPresent(record::getPrivateProfile)
            .set(roadmapLayout).equalToWhenPresent(record::getRoadmapLayout)
            .set(includePrivateContributions).equalToWhenPresent(record::getIncludePrivateContributions)
            .set(commitEmail).equalToWhenPresent(record::getCommitEmail)
            .set(groupView).equalToWhenPresent(record::getGroupView)
            .set(managingGroupId).equalToWhenPresent(record::getManagingGroupId)
            .set(firstName).equalToWhenPresent(record::getFirstName)
            .set(lastName).equalToWhenPresent(record::getLastName)
            .set(staticObjectToken).equalToWhenPresent(record::getStaticObjectToken)
            .set(role).equalToWhenPresent(record::getRole)
            .set(userType).equalToWhenPresent(record::getUserType)
            .where(id, isEqualTo(record::getId))
        );
    }
}