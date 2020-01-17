package com.example.personalitytypes;

import java.util.ArrayList;

public class PersonalitiesData {
    private static String[] personalityNames = {
            "Architect",
            "Logician",
            "Commander",
            "Debater",
            "Advocate",
            "Mediator",
            "Protagonist",
            "Campaigner",
            "Logistician",
            "Defender",
            "Executive",
            "Consul",
            "Virtuoso",
            "Adventurer",
            "Entrepreneur",
            "Entertainer"
    };

    private static String[] personalityDescriptions = {
            "Imaginative and strategic thinkers, with a plan for everything.",
            "Innovative inventors with an unquenchable thirst for knowledge.",
            "Bold, imaginative and strong-willed leaders, always finding a way – or making one.",
            "Smart and curious thinkers who cannot resist an intellectual challenge.",
            "Quiet and mystical, yet very inspiring and tireless idealists.",
            "Poetic, kind and altruistic people, always eager to help a good cause.",
            "Charismatic and inspiring leaders, able to mesmerize their listeners.",
            "Enthusiastic, creative and sociable free spirits, who can always find a reason to smile.",
            "Practical and fact-minded individuals, whose reliability cannot be doubted.",
            "Very dedicated and warm protectors, always ready to defend their loved ones.",
            "Excellent administrators, unsurpassed at managing things – or people.",
            "Extraordinarily caring, social and popular people, always eager to help.",
            "Bold and practical experimenters, masters of all kinds of tools.",
            "Flexible and charming artists, always ready to explore and experience something new.",
            "Smart, energetic and very perceptive people, who truly enjoy living on the edge.",
            "Spontaneous, energetic and enthusiastic people – life is never boring around them."
    };

    private static int[] coverImages = {
            R.drawable.cover_architect,
            R.drawable.cover_logician,
            R.drawable.cover_commander,
            R.drawable.cover_debater,
            R.drawable.cover_advocate,
            R.drawable.cover_mediator,
            R.drawable.cover_protagonist,
            R.drawable.cover_campaigner,
            R.drawable.cover_logistician,
            R.drawable.cover_executive,
            R.drawable.cover_consul,
            R.drawable.cover_virtuoso,
            R.drawable.cover_adventurer,
            R.drawable.cover_entrepreneur,
            R.drawable.cover_entertainer,
    };

    private static int[] detailImages = {
            R.drawable.ic_architect,
            R.drawable.ic_logician,
            R.drawable.ic_commander,
            R.drawable.ic_debater,
            R.drawable.ic_advocate,
            R.drawable.ic_mediator,
            R.drawable.ic_protagonist,
            R.drawable.ic_campaigner,
            R.drawable.ic_logistician,
            R.drawable.ic_executive,
            R.drawable.ic_consul,
            R.drawable.ic_virtuoso,
            R.drawable.ic_adventurer,
            R.drawable.ic_entrepreneur,
            R.drawable.ic_entertainer,
    };

    private static String[] detailDescriptions = {
            "It can be lonely at the top. Being one of the rarest personality types and being among the most capable people, Architects know this all too well. They make up just two percent of the population, and women with this personality type are especially rare, forming only 0.8%. It can be difficult for Architects to find people who can keep up with their non-stop analysis of things. People with this personality type are imaginative yet decisive... ambitious yet like their privacy... curious about everything but remain focused.",
            "The Logician personality type is fairly rare, making up only three percent of the population, which is definitely a good thing for them, as there’s nothing they’d be more unhappy about than being “common”. Logicians pride themselves on their inventiveness and creativity, their unique perspective and vigorous intellect. Usually known as the philosopher, the architect, or the dreamy professor, Logicians have been responsible for many scientific discoveries throughout history.",
            "Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds together behind a common goal. However, Commanders are also characterized by an often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves. Perhaps it is best that they make up only three percent of the population, lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world – but we have Commanders to thank for many of the businesses and institutions we take for granted every day.",
            "The Debater personality type is the ultimate devil’s advocate, thriving on the process of shredding arguments and beliefs and letting the ribbons drift in the wind for all to see. Debaters don’t do this because they are trying to achieve some deeper purpose or strategic goal, but for the simple reason that it’s fun. No one loves the process of mental sparring more than Debaters, as it gives them a chance to exercise their effortlessly quick wit, broad accumulated knowledge base, and capacity for connecting disparate ideas to prove their points.",
            "The Advocate personality type is very rare, making up less than one percent of the population, but they nonetheless leave their mark on the world. Advocates have an inborn sense of idealism and morality, but what sets them apart is that they are not idle dreamers. These individuals are capable of taking concrete steps to realize their goals and make a lasting positive impact.",
            "Mediator personalities are true idealists, always looking for the hint of good in even the worst of people and events, searching for ways to make things better. While they may be perceived as calm, reserved, or even shy, Mediators have an inner flame and passion that can truly shine. Comprising just 4% of the population, the risk of feeling misunderstood is unfortunately high for the Mediator personality type – but when they find like-minded people to spend their time with, the harmony they feel will be a fountain of joy and inspiration.",
            "Protagonists are natural-born leaders, full of passion and charisma. Forming around two percent of the population, they are oftentimes our politicians, our coaches and our teachers, reaching out and inspiring others to achieve and to do good in the world. With a natural confidence that begets influence, Protagonists take a great deal of pride and joy in guiding others to work together to improve themselves and their community.",
            "The Campaigner personality is a true free spirit. They are often the life of the party, but unlike types in the Explorer Role group, Campaigners are less interested in the sheer excitement and pleasure of the moment than they are in enjoying the social and emotional connections they make with others. Charming, independent, energetic and compassionate, the 7% of the population that they comprise can certainly be felt in any crowd.",
            "The Logistician personality type is thought to be the most abundant, making up around 13% of the population. Their defining characteristics of integrity, practical logic and tireless dedication to duty make Logisticians a vital core to many families, as well as organizations that uphold traditions, rules and standards, such as law offices, regulatory bodies and military. People with the Logistician personality type enjoy taking responsibility for their actions, and take pride in the work they do – when working towards a goal, Logisticians hold back none of their time and energy completing each relevant task with accuracy and patience.",
            "The Defender personality type is quite unique, as many of their qualities defy the definition of their individual traits. Though sensitive, Defenders have excellent analytical abilities; though reserved, they have well-developed people skills and robust social relationships; and though they are generally a conservative type, Defenders are often receptive to change and new ideas. As with so many things, people with the Defender personality type are more than the sum of their parts, and it is the way they use these strengths that defines who they are.",
            "Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.",
            "People who share the Consul personality type are, for lack of a better word, popular – which makes sense, given that it is also a very common personality type, making up twelve percent of the population. In high school, Consuls are the cheerleaders and the quarterbacks, setting the tone, taking the spotlight and leading their teams forward to victory and fame. Later in life, Consuls continue to enjoy supporting their friends and loved ones, organizing social gatherings and doing their best to make sure everyone is happy.",
            "Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go. Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before.",
            "Adventurer personalities are true artists, but not necessarily in the typical sense where they’re out painting happy little trees. Often enough though, they are perfectly capable of this. Rather, it’s that they use aesthetics, design and even their choices and actions to push the limits of social convention. Adventurers enjoy upsetting traditional expectations with experiments in beauty and behavior – chances are, they’ve expressed more than once the phrase “Don’t box me in!”",
            "Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.",
            "If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type. Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging others, and no other personality type does it with such irresistible style."
    };

    static ArrayList<Personality> getListData() {
        ArrayList<Personality> list = new ArrayList<>();
        for (int position = 0; position < personalityNames.length; position++) {
            Personality personality = new Personality();
            personality.setPersonalityName(personalityNames[position]);
            personality.setCoverDescription(personalityDescriptions[position]);
            personality.setCoverPhoto(coverImages[position]);
            personality.setDetailPhoto(detailImages[position]);
            personality.setDetailDescription(detailDescriptions[position]);
            list.add(personality);
        }
        return list;
    }

}
