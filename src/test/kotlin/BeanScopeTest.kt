import com.fusion.app.controller.HomeController
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import kotlin.test.Test


@ExtendWith(SpringExtension::class)
@ContextConfiguration("file:web/WEB-INF/spring/applicationContext.xml")
class BeanScopeTest {
    @Autowired
    lateinit var homeController: HomeController

    @Autowired
    lateinit var applicationContext:ApplicationContext

    @Test
    fun test() {
        homeController.data = "new one"

        val bean = applicationContext.getBean("homeController") as HomeController
        assertEquals("hello spring", bean.data)

    }
}