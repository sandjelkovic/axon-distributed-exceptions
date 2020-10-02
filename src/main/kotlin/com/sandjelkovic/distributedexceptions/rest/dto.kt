package com.sandjelkovic.distributedexceptions.rest

/**
 * @author Stefan Andjelkovic
 */
data class IssueNewGiftCardDto(
        val amount: Int
)

/**
 * @author Stefan Andjelkovic
 */
data class RedeemDto(
        val amount: Int
)
