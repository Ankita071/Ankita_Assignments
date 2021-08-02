package assignment6.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@Component
@PropertySource("classpath:dbConfig.properties")
public class DBConnection {

	@Autowired
	Environment env;

	@Value("${db.driverClassName}")
	String driverClassName;
	@Value("${db.dburl}")
	private String dburl;
	@Value("${db.userName}")
	private String dbUserName;
	@Value("${db.password}")
	private String dbPassword;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getDburl() {
		return dburl;
	}

	public void setDburl(String dburl) {
		this.dburl = dburl;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

//	@Bean
//	@Override
//	public String toString() {
//		return "DBConnection [driverClassName=" + driverClassName + ", dburl=" + dburl + ", dbUserName=" + dbUserName
//				+ ", dbPassword=" + dbPassword + "]";
//	}

	public void printDbConfig() {
		System.out.println("Driver Class Name: " + env.getProperty("db.driverClassName") + "\nURL Name: "
				+ env.getProperty("db.dburl") + "\nUser Name: " + env.getProperty("db.userName") + "\nPassword: "
				+ env.getProperty("db.password"));
	}
}