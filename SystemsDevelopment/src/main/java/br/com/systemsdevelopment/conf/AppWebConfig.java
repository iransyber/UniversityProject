package br.com.systemsdevelopment.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.systemsdevelopment.controllers.HomeController;
import br.com.systemsdevelopment.daos.AutorDAO;
import br.com.systemsdevelopment.daos.CategoriaDAO;
import br.com.systemsdevelopment.daos.EditoraDAO;
import br.com.systemsdevelopment.daos.EspecialidadeLiterariaDAO;
import br.com.systemsdevelopment.daos.GlobalFactoryEntity;
<<<<<<< HEAD
import br.com.systemsdevelopment.daos.ItemDAO;
=======
import br.com.systemsdevelopment.daos.LivroDAO;
import br.com.systemsdevelopment.daos.LocacaoDAO;
import br.com.systemsdevelopment.daos.UsuarioDAO;
>>>>>>> cbc55a8148620d9a1035f7dc702f4298ab1abb58


@EnableWebMvc
@ComponentScan(basePackageClasses = {
										HomeController.class,
										AutorDAO.class,
										GlobalFactoryEntity.class,
										CategoriaDAO.class,
										EditoraDAO.class,
<<<<<<< HEAD
										ItemDAO.class
=======
										LivroDAO.class,
										UsuarioDAO.class,
										EspecialidadeLiterariaDAO.class,
										LocacaoDAO.class
>>>>>>> cbc55a8148620d9a1035f7dc702f4298ab1abb58
									})
public class AppWebConfig {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
