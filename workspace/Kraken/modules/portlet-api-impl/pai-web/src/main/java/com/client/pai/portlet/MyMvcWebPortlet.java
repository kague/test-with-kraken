package com.client.pai.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.client.pai.constants.MyMvcWebPortletKeys;
import com.client.projet.pai.api.MyApi;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author Kague
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category="+MyMvcWebPortletKeys.GROUP_CATEGORY,
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=PAI",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyMvcWebPortletKeys.MyMvcWeb, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class MyMvcWebPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		renderRequest.setAttribute("doSomething", _api.getCoucou());
		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private MyApi _api;
}