package com.client.projet.pai.impl;

import com.client.projet.pai.api.MyApi;

import org.osgi.service.component.annotations.Component;

/**
 * @author Kague
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = MyApi.class
)
public class MyImpl implements MyApi {

	@Override
	public String getCoucou() {
		return "coucou from Impl";
	}

}