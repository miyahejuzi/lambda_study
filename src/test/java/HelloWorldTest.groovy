import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author miya* @date 19-11-24
 */
class HelloWorldTest extends Specification {

    @Unroll
    def "HelloWorld"() {
        given:
        def helloWorld = new HelloWorld()
        expect:
        result == helloWorld.helloWorld(name)
        where:
        result             || name   | description
        "hello world name" || "name" | "is true"
        "hello world miya" || "nam"  | "is false"
    }
}
