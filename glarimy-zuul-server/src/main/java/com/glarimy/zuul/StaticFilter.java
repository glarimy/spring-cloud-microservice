package com.glarimy.zuul;

import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import com.netflix.zuul.filters.StaticResponseFilter;

@Component
public class StaticFilter extends StaticResponseFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public Object uri() {
        return Pattern.compile("/glarimy/home");
    }

    @Override
    public String responseBody() {
            return "<h1>Glarimy Library</h1><hr/>";
    }
}