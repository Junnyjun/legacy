import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.registerBean
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@ContextConfiguration("file:web/WEB-INF/spring/applicationContext.xml")
class IocContainerTest {

    @Autowired
    lateinit var beanFactory: BeanFactory

    @Autowired
    lateinit var applicationContext:GenericApplicationContext
    @Test
    fun test() {
        applicationContext.registerBean<Any>("test")
        beanFactory.getBean("homeController")
    }
}

