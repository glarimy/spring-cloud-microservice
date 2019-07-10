package com.glarimy.zuul;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class CorrolationFilter extends ZuulFilter {
	Logger logger = LoggerFactory.getLogger(CorrolationFilter.class);

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
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		String cid = UUID.randomUUID().toString();
		System.out.println("cid generated: " + cid);
		ctx.addZuulRequestHeader("cid", cid);
		return null;
	}
}
