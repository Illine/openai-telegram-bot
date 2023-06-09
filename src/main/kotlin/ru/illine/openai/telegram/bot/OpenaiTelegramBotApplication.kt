package ru.illine.openai.telegram.bot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import ru.illine.openai.telegram.bot.config.property.AsyncProperties
import ru.illine.openai.telegram.bot.config.property.LogbookProperties
import ru.illine.openai.telegram.bot.config.property.MessagesProperties
import ru.illine.openai.telegram.bot.config.property.OpenAIProperties
import ru.illine.openai.telegram.bot.config.property.TelegramBotProperties
import ru.illine.openai.telegram.bot.config.property.VersionProperties

@EnableConfigurationProperties(
    *[
        TelegramBotProperties::class,
        OpenAIProperties::class,
        MessagesProperties::class,
        LogbookProperties::class,
        VersionProperties::class,
        AsyncProperties::class
    ]
)
@SpringBootApplication
class OpenaiTelegramBotApplication

fun main(args: Array<String>) {
    runApplication<OpenaiTelegramBotApplication>(*args)
}
