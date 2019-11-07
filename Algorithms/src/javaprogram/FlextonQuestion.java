package javaprogram;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class FlextonQuestion {
//
//    int[] arr = {1, 2, 3, 4, 5, 6};
//
////    we have get a list with only even numbers from this list using java 8?
//
//    List<Integer> res = Arrays.stream(arr).filter(i -> i % 2 == 0).collect(Collectors.toList());
//
//
////    given a string, for example "Hello world Hello Sam", use java 8 stream return the frequency of each word.
//
//
////    Map<String, Integer> map = Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(s -> s), Collectors.counting());
//
////    Given a list of purchases return  10  users who spent most amount that day
////
////    Purchase class has email , amount , productid
//
//
//    List<Purchase> list = new ArrayList<>();
//
//    class Purchase {
//        String email;
//        int amount;
//        int productId;
//        Date date;
//
//    }
//
////return 10
////    users who
////    spent most
////    amount that
////    day
//
//    List<Purchase> result = list.stream().order(Comparator.comparing((p1, p2) -> {
//        return p1 - p2
//    })).limit(10).collect(Collectors.toList());
//
//
//    String str = new String("String");
//    String str = "String";
//
//
//    abstract class vs
//
//    interface?
//
//
//    abstract class Writer {
//        public static void write() {
//            System.out.println("Writing...");
//        }
//    }
//
//    class Author extends Writer {
//        public static void write() {
//            System.out.println("Writing book");
//        }
//    }
//
//    public class Programmer extends Writer {
//        public static void write() {
//            System.out.println("Writing code");
//        }
//
//        public static void main(String[] args) {
//            Writer w = new Programmer();
//            w.write();
//        }
//    }
//
////    can you
////    explain the
////    Internal working
////    of HashSet?
////
////    How does
////    JVM Allocates
////    memory to
////    primitive data
////    types and
////    objects ?
////    What about
////    static methods and
////    Static data
////    will be
////    allocated in
//
////
////======================================================================================================
////
////    Spring Framework
////
////    Application Context -
////    it will
////    contain bean
////    and intialize
////    and inject
////    the bean
////    where we
////    want to
////    use it
////    IOC Container -
////    will contain
////    the bean
////    Spring Interceptor -
////    checking mechanism
////    to check
////    when we
////    call the
////    service and
////    call handleInterceptor
////    Spring Web
////    Filter -
////    It is
////    applied for Servlet ,
////    its mechanism
////    is similar
////    to spring
////    interceptor
////    @Autowired -
////    its used
////    to inject
////    the bean
////    into the
////    component we
////    want to
////    use
////    @Component -
////    annotation to
////    define the
////    component for spring,
////    component is
////    a bean, used for
////    scanning of
////    component in
////    an spring
////    application
////    @Transactional -
////    used to
////    transactional behavior for
////    the service, transactional
////    means it
////    has some
////    kind of
////    rollback ,isolate,propagation
////    @service -
////    special annotation, it
////    defines the
////    service where
////    the business
////    logic is
////    present
////    @Qualifier -
////    to distinguish
////    between beans
////    and specifies
////    which bean
////    we want
////    to inject
////    @Value -
////    inject the
////    value of
////    the property
////    file
////    @Profile -
////    specify the
////    environment
////    REST API
////    @RestController
////    vs@Controller
////
////    controller +
////    response Body = restController
////
////    implement a
////    rest Controller, Entity
////    class ,repository ,service for employee
////
////    @Entity
////
////    public class Employee {
////        @Id
////        private Long id;
////        private String name;
////
//////getter, setter....
////    }
////
////    @RestController
////    @RequestMapping()
////    public class SampleRestController {
////
////        @Autowired
////        private IEmployeeService employeeService;
////
////        @GetMapping("/employee/{id}")
////        public EmployeeDto get(@PathVariable Long id) {
////            Employee emp = employeeService.findEmp(id);
////            EmployeeDto dto = mapToDto(emp); // map to DTO
////            return dto;
////        }
////
////    }
////
////    @Repository
////    public interface EmployeeRepository extends JPARepository<Long, Employee> {
////
////    }
////
////    interface IEmployeeService {
////        Employee findEmp(Long id);
////    }
////
////    @Service
////    @Transactional(rollbackFor = Throwable.class)
////    public class EmployeeService implements IEmployeeService {
////
////        @Autowired
////        private EmployeeRepository employeeRepository;
////
////        @Override
////        public Employee findEmp(Long id) {
////            return employeeRepository.findById(id);
////        }
////    }
////
////        ================================================================================================
////
////    Analyze the
////    below code, explain this
////    code.and output
////    of this code
////
////    public class NewString {
////        public String newString(String str) {
////            if ((str == null) || (str.length() <= 1))
////                return str;
////            return newString(str.substring(0, str.length() - 2)) + str.charAt(str.length() - 1);
////        }
////
////        public static void main(String[] args) {
////            NewString obj = new NewString();
////            String str = "Flexton";
////            System.out.println("New String   is \'" + obj.newString(str) + "\'");
////        }
////    }
//}
