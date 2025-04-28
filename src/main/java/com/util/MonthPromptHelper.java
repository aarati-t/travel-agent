package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import dev.langchain4j.data.message.ChatMessage;



public class MonthPromptHelper {
	// Pattern to match month names
    private static final Pattern MONTH_PATTERN = Pattern.compile(
            "\\b(January|February|March|April|May|June|July|August|September|October|November|December)\\b",
            Pattern.CASE_INSENSITIVE
    );

    public static List<ChatMessage> addMonthSystemPromptIfMissing(String originalMessages) {
        boolean containsMonth = originalMessages!=null?MONTH_PATTERN.matcher(originalMessages).find():false;
                

       

       /* if (!containsMonth) {
            updatedMessages.add(0, SystemMessage.from("Please specify the month of travel in your response."));
        }*/

        return null;
    }

  
}
