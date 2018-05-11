
package com.client.projet.portlet.portlet;

import com.client.projet.portlet.constants.PortletWithConfigPanelPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Kague
 */
@Component(immediate = true, property = {
	"com.liferay.portlet.display-category=" +
		PortletWithConfigPanelPortletKeys.GROUP_CATEGORY,
	"com.liferay.portlet.instanceable=true",
	"javax.portlet.display-name=Portlet-with-config-panel",
	"javax.portlet.init-param.template-path=/",
	"javax.portlet.init-param.view-template=/view.jsp",
	"javax.portlet.name=" +
		PortletWithConfigPanelPortletKeys.PortletWithConfigPanel,
	"javax.portlet.resource-bundle=content.Language",
	"javax.portlet.security-role-ref=power-user,user"
}, service = Portlet.class)
public class PortletWithConfigPanelPortlet extends MVCPortlet {
}
