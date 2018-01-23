package com.tomcio.wypok.dao;

import com.tomcio.wypok.data.Vote;

public interface VoteDAO  extends GenericDAO<Vote, Long>{
	
	public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);

}
