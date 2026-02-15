package com.thejaxonhill.dnd5eapi.shared.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.abilityscore.infrastructure.delivery.AbilityScoreTools
import com.thejaxonhill.dnd5eapi.alignment.infrastructure.delivery.AlignmentTools
import com.thejaxonhill.dnd5eapi.background.infrastructure.delivery.BackgroundTools
import com.thejaxonhill.dnd5eapi.characterclass.infrastructure.delivery.CharacterClassTools
import com.thejaxonhill.dnd5eapi.condition.infrastructure.delivery.ConditionTools
import com.thejaxonhill.dnd5eapi.damagetype.infrastructure.delivery.DamageTypeTools
import com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery.EquipmentTools
import com.thejaxonhill.dnd5eapi.equipmentcategory.infrastructure.delivery.EquipmentCategoryTools
import com.thejaxonhill.dnd5eapi.feat.infrastructure.delivery.FeatTools
import com.thejaxonhill.dnd5eapi.feature.infrastructure.delivery.FeatureTools
import com.thejaxonhill.dnd5eapi.language.infrastructure.delivery.LanguageTools
import com.thejaxonhill.dnd5eapi.level.infrastructure.delivery.LevelTools
import com.thejaxonhill.dnd5eapi.magicitem.infrastructure.delivery.MagicItemTools
import com.thejaxonhill.dnd5eapi.magicschool.infrastructure.delivery.MagicSchoolTools
import com.thejaxonhill.dnd5eapi.monster.infrastructure.delivery.MonsterTools
import com.thejaxonhill.dnd5eapi.proficiency.infrastructure.delivery.ProficiencyTools
import com.thejaxonhill.dnd5eapi.race.infrastructure.delivery.RaceTools
import com.thejaxonhill.dnd5eapi.rule.infrastructure.delivery.RuleTools
import com.thejaxonhill.dnd5eapi.rulesection.infrastructure.delivery.RuleSectionTools
import com.thejaxonhill.dnd5eapi.skill.infrastructure.delivery.SkillTools
import com.thejaxonhill.dnd5eapi.spell.infrastructure.delivery.SpellTools
import com.thejaxonhill.dnd5eapi.subclass.infrastructure.delivery.SubclassTools
import com.thejaxonhill.dnd5eapi.subrace.infrastructure.delivery.SubraceTools
import com.thejaxonhill.dnd5eapi.trait.infrastructure.delivery.TraitTools
import com.thejaxonhill.dnd5eapi.weaponproperty.infrastructure.delivery.WeaponPropertyTools
import org.springframework.ai.tool.ToolCallbackProvider
import org.springframework.ai.tool.method.MethodToolCallbackProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeliveryConfig {
    @Bean
    fun tools(
        abilityScoreTools: AbilityScoreTools,
        alignmentTools: AlignmentTools,
        backgroundTools: BackgroundTools,
        characterClassTools: CharacterClassTools,
        conditionTools: ConditionTools,
        damageTypeTools: DamageTypeTools,
        equipmentTools: EquipmentTools,
        equipmentCategoryTools: EquipmentCategoryTools,
        featTools: FeatTools,
        featureTools: FeatureTools,
        languageTools: LanguageTools,
        levelTools: LevelTools,
        magicItemTools: MagicItemTools,
        magicSchoolTools: MagicSchoolTools,
        monsterTools: MonsterTools,
        proficiencyTools: ProficiencyTools,
        raceTools: RaceTools,
        ruleTools: RuleTools,
        ruleSectionTools: RuleSectionTools,
        skillTools: SkillTools,
        spellTools: SpellTools,
        subclassTools: SubclassTools,
        subraceTools: SubraceTools,
        traitTools: TraitTools,
        weaponPropertyTools: WeaponPropertyTools
    ): ToolCallbackProvider =
        MethodToolCallbackProvider.builder()
            .toolObjects(
                abilityScoreTools,
                alignmentTools,
                backgroundTools,
                characterClassTools,
                conditionTools,
                damageTypeTools,
                equipmentTools,
                equipmentCategoryTools,
                featTools,
                featureTools,
                languageTools,
                levelTools,
                magicItemTools,
                magicSchoolTools,
                monsterTools,
                proficiencyTools,
                raceTools,
                ruleTools,
                ruleSectionTools,
                skillTools,
                spellTools,
                subclassTools,
                subraceTools,
                traitTools,
                weaponPropertyTools,
            ).build()
}