package spring.home.ms;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource({
	"classpath:/spring/home/ms/conf/jdbc.properties",
	"classpath:/spring/home/ms/conf/sec.properties"})
@MapperScan("spring/home/ms/dao")

// 트랜잭션 관리자를 호라성화하려면 다음 애노테이션
@EnableTransactionManagement
public class AppConfig {
	
	@Autowired
	Environment env;
	
	public AppConfig() {
		System.out.println("AppConfig() 호출됨!");
	}
	
	@Bean
	public DataSource dataSource() {
		
		System.out.println("DataSource 객체 생성!");
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		ds.setDefaultAutoCommit(false);
		
		return ds;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(
			DataSource dataSource,
			ApplicationContext appCtx) {
		System.out.println("SqlSessionFactory 객체 생성!");
		
		try {
		
			SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
			
			// DB 커넥션풀을 관릴해주는 객체
			factory.setDataSource(dataSource);
			
			// SQL 맵퍼 파일에서 도메인 객체의 별명을 사용하려면
			// 도메인 객체가 들어 있는 패키지를 지정해야 한다.
			// 그러면 Mybatis가 해당 패키지의 모든 클래스에 대해 별명을 자동으로 생성
			factory.setTypeAliasesPackage("spring.home.ms.domain");
			
			factory.setMapperLocations(appCtx.getResources(
				"classpath:/spring/home/ms/mapper/**/*.xml"	
				));
			
			return factory.getObject();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}

	// 트랜잭션 관리자의 이름은 반드시 "trancactionManger"이어야 한다.
	// 그래서 메서드 이름을 다음과 같이 해야한다.
	// Spring에서 트랜잭션 관리자를 찾을  이 이름으로 찾는다.
	// 만약 트랜잭션 이름을 다른 이름을 지었다면
	// 트랜잭션 관리 설정에서 그 이름을 알려줘야 한다.
	public PlatformTransactionManager transactionManager(
			DataSource dataSource) {
		// 트랜잭션 관리자가 하는 일은 DB 커넥션의 commit과 rollback을 다루는 것이다.
		// 따라서 트랜잭션 관리자는 DB 커넥션을 제공해주는
		// DataSource(DB 커넥션 풀)가 필요하다.
		// 그래서 트랜잭션 관리자를 만들  반드시 DataSource 객체를 넘겨줘야 한다.
		// 물론 관리자 객체를 만든 후에 세터를 만든 후에 세터를 호출해서 넘겨줘도 된다.
		return new DataSourceTransactionManager(dataSource);
	}
	
	
}