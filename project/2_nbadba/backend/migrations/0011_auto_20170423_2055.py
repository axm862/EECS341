# -*- coding: utf-8 -*-
# Generated by Django 1.11 on 2017-04-23 20:55
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('backend', '0010_auto_20170423_2054'),
    ]

    operations = [
        migrations.AlterField(
            model_name='player',
            name='height',
            field=models.CharField(max_length=10),
        ),
    ]
