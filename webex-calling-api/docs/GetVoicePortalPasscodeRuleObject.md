

# GetVoicePortalPasscodeRuleObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expirePasscode** | [**GetVoicePortalPasscodeRuleObjectExpirePasscode**](GetVoicePortalPasscodeRuleObjectExpirePasscode.md) |  |  [optional] |
|**failedAttempts** | [**GetVoicePortalPasscodeRuleObjectFailedAttempts**](GetVoicePortalPasscodeRuleObjectFailedAttempts.md) |  |  [optional] |
|**blockPreviousPasscodes** | [**GetVoicePortalPasscodeRuleObjectBlockPreviousPasscodes**](GetVoicePortalPasscodeRuleObjectBlockPreviousPasscodes.md) |  |  [optional] |
|**blockRepeatedDigits** | **Object** | Settings for not allowing single or groups of repeated digits in passcode (for example, 22888, 121212, or 408408).      + enabled: true (boolean) - If enabled, passcode should not contain repeated digits.     + max: &#x60;3&#x60; (number) - Maximum number of digits to be considered as a repeated sequence. The minimum value is 1. The maximum value is 6. |  [optional] |
|**blockContiguousSequences** | **Object** | Settings for not allowing numerical sequence in passcode (for example, 012345 or 987654).      + enabled: true (boolean) - If enabled, do not allow the specified number of ascending or descending digits in a row.     + numberOfAscendingDigits: &#x60;3&#x60; (number) -  Number of ascending digits in sequence. The minimum value is 2. The maximum value is 5.     + numberOfDescendingDigits: &#x60;3&#x60; (number) -  Number of descending digits in sequence. The minimum value is 2. The maximum value is 5. |  [optional] |
|**length** | [**GetVoicePortalPasscodeRuleObjectLength**](GetVoicePortalPasscodeRuleObjectLength.md) |  |  [optional] |
|**blockRepeatedPatternsEnabled** | **Boolean** | If enabled, the passcode do not contain repeated pattern. |  [optional] |
|**blockUserNumberEnabled** | **Boolean** | If enabled, the passcode do not allow user phone number or extension. |  [optional] |
|**blockReversedUserNumberEnabled** | **Boolean** | If enabled, the passcode do not allow revered phone number or extension. |  [optional] |
|**blockReversedOldPasscodeEnabled** | **Boolean** | If enabled, the passcode do not allow setting reversed old passcode. |  [optional] |



