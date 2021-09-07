package david.augusto.luan.gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

public class AddRequestHeaderFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        context.addZuulRequestHeader("X-source", "Zuul");
        return null;
    }

    @Bean
    public AddRequestHeaderFilter addRequestHeaderFilter() {
        return new AddRequestHeaderFilter();
    }

    @RequestMapping("/")
    public String demo(@RequestHeader("X-source") String source) {
        return "Primeiro service com" + source;
    }
}
