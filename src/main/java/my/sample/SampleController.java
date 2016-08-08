package my.sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value = "/handle-error/{pattern}")
    public void error(@PathVariable int pattern) throws MyException, MyException2 {

        switch (pattern) {
            case 1:
                throw new MyException("例外1がスローされた");
            case 2:
                throw new MyException2("例外2がスローされた");
        }

    }

}
