package com.ripple.poc.response.objectmapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	@JsonProperty("id")
    protected String id;
	
	@JsonProperty("result")
    protected Result result;
	
	@JsonProperty("info")
	protected Result.Info info;
	
	
	
	@JsonProperty("type")
    protected String type;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Result.Info getInfo() {
		return info;
	}

	public void setInfo(Result.Info info) {
		this.info = info;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	   public static class Result {

		   @JsonProperty("info")
	        protected Result.Info info;
		   
		   @JsonProperty("status")
		    protected String status;
	       
	        public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


			public Result.Info getInfo() {
	            return info;
	        }

	       
	        public void setInfo(Result.Info value) {
	            this.info = value;
	        }

	        public static class Info {

	        	@JsonProperty("build_version")
	            protected String build_version;
	        	
	            @JsonProperty("complete_ledgers")
	            protected String complete_ledgers;
	            
	            @JsonProperty("hostid")
	            protected String hostid;
	            
	            @JsonProperty("io_latency_ms")
	            protected int io_latency_ms;
	           
	            @JsonProperty("jq_trans_overflow")
	            protected String jq_trans_overflow;
	            
	            
	            @JsonProperty("last_close")
	            protected Result.Info.LastClose last_close;
	            
	            @JsonProperty("load_factor")
	            protected int load_factor;
	            
	            
	            @JsonProperty("peer_disconnects")
	            protected String peer_disconnects;
	            
	            
	            @JsonProperty("peer_disconnects_resources")
	            protected String peer_disconnects_resources;
	            
	            
	            @JsonProperty("peers")
	            protected int peers;
	            
	            
	            @JsonProperty("pubkey_node")
	            protected String pubkey_node;
	            
	            
	            @JsonProperty("server_state")
	            protected String serverState;
	            
	            
	            @JsonProperty("server_state_duration_us")
	            protected BigInteger serverStateDurationUs;
	           
	            @JsonProperty("state_accounting")
	            protected Result.Info.StateAccounting stateAccounting;
	            
	            @JsonProperty("time")
	            protected String time;
	            
	            @JsonProperty("uptime")
	            protected long uptime;
	            
	            @JsonProperty("validated_ledger")
	            protected Result.Info.ValidatedLedger validatedLedger;
	            
	            @JsonProperty("validation_quorum")
	            protected int validationQuorum;

	            public String getBuildVersion() {
	                return build_version;
	            }

	            public void setBuildVersion(String value) {
	                this.build_version = value;
	            }

	            public String getCompleteLedgers() {
	                return complete_ledgers;
	            }

	            public void setCompleteLedgers(String value) {
	                this.complete_ledgers = value;
	            }

	            public String getHostid() {
	                return hostid;
	            }

	            public void setHostid(String value) {
	                this.hostid = value;
	            }

	            public int getIoLatencyMs() {
	                return io_latency_ms;
	            }

	            public void setIoLatencyMs(short value) {
	                this.io_latency_ms = value;
	            }

	            public String getJqTransOverflow() {
	                return jq_trans_overflow;
	            }

	            public void setJqTransOverflow(String value) {
	                this.jq_trans_overflow = value;
	            }

	            public Result.Info.LastClose getLastClose() {
	                return last_close;
	            }

	            public void setLastClose(Result.Info.LastClose value) {
	                this.last_close = value;
	            }

	            public int getLoadFactor() {
	                return load_factor;
	            }

	            public void setLoadFactor(short value) {
	                this.load_factor = value;
	            }

	            public String getPeerDisconnects() {
	                return peer_disconnects;
	            }

	            public void setPeerDisconnects(String value) {
	                this.peer_disconnects = value;
	            }

	            public String getPeerDisconnectsResources() {
	                return peer_disconnects_resources;
	            }

	            public void setPeerDisconnectsResources(String value) {
	                this.peer_disconnects_resources = value;
	            }

	            public int getPeers() {
	                return peers;
	            }

	            public void setPeers(short value) {
	                this.peers = value;
	            }

	            public String getPubkeyNode() {
	                return pubkey_node;
	            }

	            public void setPubkeyNode(String value) {
	                this.pubkey_node = value;
	            }

	            public String getServerState() {
	                return serverState;
	            }

	            public void setServerState(String value) {
	                this.serverState = value;
	            }

	            public BigInteger getServerStateDurationUs() {
	                return serverStateDurationUs;
	            }

	            public void setServerStateDurationUs(BigInteger value) {
	                this.serverStateDurationUs = value;
	            }

	            public Result.Info.StateAccounting getStateAccounting() {
	                return stateAccounting;
	            }

	            public void setStateAccounting(Result.Info.StateAccounting value) {
	                this.stateAccounting = value;
	            }

	            public String getTime() {
	                return time;
	            }

	            public void setTime(String value) {
	                this.time = value;
	            }

	            public long getUptime() {
	                return uptime;
	            }

	            public void setUptime(long value) {
	                this.uptime = value;
	            }

	            public Result.Info.ValidatedLedger getValidatedLedger() {
	                return validatedLedger;
	            }

	            public void setValidatedLedger(Result.Info.ValidatedLedger value) {
	                this.validatedLedger = value;
	            }

	          
	            public int getValidationQuorum() {
	                return validationQuorum;
	            }

	            /**
	             * Sets the value of the validationQuorum property.
	             * 
	             */
	            public void setValidationQuorum(int value) {
	                this.validationQuorum = value;
	            }


	            public static class LastClose {

	               
	                @JsonProperty("converge_time_s")
	                protected BigDecimal convergeTimeS;
	               
	                @JsonProperty("proposers")
	                protected int proposers;

	              
	                public BigDecimal getConvergeTimeS() {
	                    return convergeTimeS;
	                }

	              
	                public void setConvergeTimeS(BigDecimal value) {
	                    this.convergeTimeS = value;
	                }

	               
	                public int getProposers() {
	                    return proposers;
	                }

	              
	                public void setProposers(int value) {
	                    this.proposers = value;
	                }

	            }


	            public static class StateAccounting {

	            	 @JsonProperty("connected")
	                protected Result.Info.StateAccounting.Connected connected;
	            	 @JsonProperty("disconnected")
	                protected Result.Info.StateAccounting.Disconnected disconnected;
	            	 @JsonProperty("full")
	                protected Result.Info.StateAccounting.Full full;
	            	 @JsonProperty("syncing")
	                protected Result.Info.StateAccounting.Syncing syncing;
	            	 @JsonProperty("tracking")
	                protected Result.Info.StateAccounting.Tracking tracking;

	                public Result.Info.StateAccounting.Connected getConnected() {
	                    return connected;
	                }

	                public void setConnected(Result.Info.StateAccounting.Connected value) {
	                    this.connected = value;
	                }

	               
	                public Result.Info.StateAccounting.Disconnected getDisconnected() {
	                    return disconnected;
	                }

	                
	                public void setDisconnected(Result.Info.StateAccounting.Disconnected value) {
	                    this.disconnected = value;
	                }

	               
	                public Result.Info.StateAccounting.Full getFull() {
	                    return full;
	                }

	               
	                public void setFull(Result.Info.StateAccounting.Full value) {
	                    this.full = value;
	                }

	               
	                public Result.Info.StateAccounting.Syncing getSyncing() {
	                    return syncing;
	                }

	               
	                public void setSyncing(Result.Info.StateAccounting.Syncing value) {
	                    this.syncing = value;
	                }

	               
	                public Result.Info.StateAccounting.Tracking getTracking() {
	                    return tracking;
	                }

	               
	                public void setTracking(Result.Info.StateAccounting.Tracking value) {
	                    this.tracking = value;
	                }


	                public static class Connected {

	                	@JsonProperty("duration_us")
	                    protected String durationUs;
	                	@JsonProperty("transitions")
	                    protected int transitions;

	                   
	                    public String getDurationUs() {
	                        return durationUs;
	                    }

	                   
	                    public void setDurationUs(String value) {
	                        this.durationUs = value;
	                    }

	                    
	                    public int getTransitions() {
	                        return transitions;
	                    }

	                   
	                    public void setTransitions(int value) {
	                        this.transitions = value;
	                    }

	                }


	               
	                public static class Disconnected {

	                	@JsonProperty("duration_us")
	                    protected String durationUs;
	                	@JsonProperty("transitions")
	                    protected int transitions;

	                    public String getDurationUs() {
	                        return durationUs;
	                    }

	                    
	                    public void setDurationUs(String value) {
	                        this.durationUs = value;
	                    }

	                   
	                    public int getTransitions() {
	                        return transitions;
	                    }

	                   
	                    public void setTransitions(int value) {
	                        this.transitions = value;
	                    }

	                }


	                public static class Full {

	                	@JsonProperty("duration_us")
	                    protected String durationUs;
	                	@JsonProperty("transitions")
	                    protected int transitions;

	                    
	                    public String getDurationUs() {
	                        return durationUs;
	                    }

	                    public void setDurationUs(String value) {
	                        this.durationUs = value;
	                    }

	                    
	                    public int getTransitions() {
	                        return transitions;
	                    }

	                   
	                    public void setTransitions(short value) {
	                        this.transitions = value;
	                    }

	                }


	                public static class Syncing {

	                	@JsonProperty("duration_us")
	                    protected String durationUs;
	                    @JsonProperty("transitions")
	                    protected int transitions;

	                   
	                    public String getDurationUs() {
	                        return durationUs;
	                    }

	                   
	                    public void setDurationUs(String value) {
	                        this.durationUs = value;
	                    }

	                  
	                    public int getTransitions() {
	                        return transitions;
	                    }

	                   
	                    public void setTransitions(int value) {
	                        this.transitions = value;
	                    }

	                }


	                public static class Tracking {

	                	@JsonProperty("duration_us")
	                    protected String durationUs;
	                	@JsonProperty("transitions")
	                    protected int transitions;

	                  
	                    public String getDurationUs() {
	                        return durationUs;
	                    }

	                   
	                    public void setDurationUs(String value) {
	                        this.durationUs = value;
	                    }

	                    public int getTransitions() {
	                        return transitions;
	                    }

	                  
	                    public void setTransitions(int value) {
	                        this.transitions = value;
	                    }

	                }

	            }


	            public static class ValidatedLedger {

	            	 @JsonProperty("age")
	                protected short age;
	            	 @JsonProperty("base_fee_xrp")
	                protected float baseFeeXrp;
	            	 @JsonProperty("hash")
	                protected String hash;
	            	 @JsonProperty("reserve_base_xrp")
	                protected short reserveBaseXrp;
	            	 @JsonProperty("reserve_inc_xrp")
	              
	                protected short reserveIncXrp;
	            	 @JsonProperty("seq")
	                protected long seq;

	                
	                public short getAge() {
	                    return age;
	                }

	                
	                public void setAge(short value) {
	                    this.age = value;
	                }

	                
	                public float getBaseFeeXrp() {
	                    return baseFeeXrp;
	                }

	                
	                public void setBaseFeeXrp(float value) {
	                    this.baseFeeXrp = value;
	                }

	                
	                public String getHash() {
	                    return hash;
	                }

	                
	                public void setHash(String value) {
	                    this.hash = value;
	                }

	               
	                public short getReserveBaseXrp() {
	                    return reserveBaseXrp;
	                }

	                
	                public void setReserveBaseXrp(short value) {
	                    this.reserveBaseXrp = value;
	                }

	                
	                public short getReserveIncXrp() {
	                    return reserveIncXrp;
	                }

	                
	                public void setReserveIncXrp(short value) {
	                    this.reserveIncXrp = value;
	                }

	                
	                public long getSeq() {
	                    return seq;
	                }

	                
	                public void setSeq(long value) {
	                    this.seq = value;
	                }

	            }

	        }

	    }

}
