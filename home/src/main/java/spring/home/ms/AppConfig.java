package spring.home.ms;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
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

// Ʈ����� �����ڸ� ȣ��ȭ�Ϸ��� ���� �ֳ����̼�
@EnableTransactionManagement
public class AppConfig {
	
	@Autowired
	Environment env;
	
	public AppConfig() {
		System.out.println("AppConfig() ȣ���!");
	}
	
	@Bean
	public DataSource dataSource() {
		
		System.out.println("DataSource ��ü ����!");
		
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
		System.out.println("SqlSessionFactory ��ü ����!");
		
		try {
		
			SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
			
			// DB Ŀ�ؼ�Ǯ�� �������ִ� ��ü
			factory.setDataSource(dataSource);
			
			// SQL ���� ���Ͽ��� ������ ��ü�� ������ ����Ϸ���
			// ������ ��ü�� ��� �ִ� ��Ű���� �����ؾ� �Ѵ�.
			// �׷��� Mybatis�� �ش� ��Ű���� ��� Ŭ������ ���� ������ �ڵ����� ����
			factory.setTypeAliasesPackage("spring.home.ms.domain");
			
			factory.setMapperLocations(appCtx.getResources(
				"classpath:/spring/home/ms/mapper/**/*.xml"	
				));
			
			return factory.getObject();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}

	// Ʈ����� �������� �̸��� �ݵ�� "trancactionManger"�̾�� �Ѵ�.
	// �׷��� �޼��� �̸��� ������ ���� �ؾ��Ѵ�.
	// Spring���� Ʈ����� �����ڸ� ã�� �� �� �̸����� ã�´�.
	// ���� Ʈ����� �̸��� �ٸ� �̸��� �����ٸ�
	// Ʈ����� ���� �������� �� �̸��� �˷���� �Ѵ�.
	public PlatformTransactionManager transactionManager(
			DataSource dataSource) {
		// Ʈ����� �����ڰ� �ϴ� ���� DB Ŀ�ؼ��� commit�� rollback�� �ٷ�� ���̴�.
		// ���� Ʈ����� �����ڴ� DB Ŀ�ؼ��� �������ִ�
		// DataSource(DB Ŀ�ؼ� Ǯ)�� �ʿ��ϴ�.
		// �׷��� Ʈ����� �����ڸ� ���� �� �ݵ�� DataSource ��ü�� �Ѱ���� �Ѵ�.
		// ���� ������ ��ü�� ���� �Ŀ� ���͸� ���� �Ŀ� ���͸� ȣ���ؼ� �Ѱ��൵ �ȴ�.
		return new DataSourceTransactionManager(dataSource);
	}
	
	
}
