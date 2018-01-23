package com.tomcio.wypok.dao;

import java.util.List;

import com.tomcio.wypok.data.Discovery;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long> {
	 List<Discovery> getAll();

}
