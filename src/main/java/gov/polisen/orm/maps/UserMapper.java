package gov.polisen.orm.maps;

import gov.polisen.orm.clients.UserSqlProvider;
import gov.polisen.orm.examples.UserExample;
import gov.polisen.orm.models.User;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "countByExample")
	int countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Delete({ "delete from users", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Insert({
			"insert into users (id, username, ",
			"realname, salt, passwordhash)",
			"values (#{id,jdbcType=INTEGER}, #{username,jdbcType=CHAR}, ",
			"#{realname,jdbcType=VARCHAR}, #{salt,jdbcType=CHAR}, #{passwordhash,jdbcType=CHAR})" })
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
	@ConstructorArgs({
			@Arg(column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),
			@Arg(column = "username", javaType = String.class, jdbcType = JdbcType.CHAR),
			@Arg(column = "realname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.CHAR),
			@Arg(column = "passwordhash", javaType = String.class, jdbcType = JdbcType.CHAR) })
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Select({ "select", "id, username, realname, salt, passwordhash",
			"from users", "where id = #{id,jdbcType=INTEGER}" })
	@ConstructorArgs({
			@Arg(column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),
			@Arg(column = "username", javaType = String.class, jdbcType = JdbcType.CHAR),
			@Arg(column = "realname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.CHAR),
			@Arg(column = "passwordhash", javaType = String.class, jdbcType = JdbcType.CHAR) })
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") User record,
			@Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Update({ "update users", "set username = #{username,jdbcType=CHAR},",
			"realname = #{realname,jdbcType=VARCHAR},",
			"salt = #{salt,jdbcType=CHAR},",
			"passwordhash = #{passwordhash,jdbcType=CHAR}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(User record);
}