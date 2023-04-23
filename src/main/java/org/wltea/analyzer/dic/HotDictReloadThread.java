package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

public class HotDictReloadThread implements Runnable{

    private static final Logger logger = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    @Override
    public void run() {
        while(true){
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
